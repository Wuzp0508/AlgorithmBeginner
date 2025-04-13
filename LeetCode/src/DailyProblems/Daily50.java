package DailyProblems;

/**
 * 50. Pow(x, n)
 */

class Solution50 {
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMultiple(x, n) : 1.0 / quickMultiple(x, -n);
    }

    private double quickMultiple(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        double y = quickMultiple(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }
}

public class Daily50 {
    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        System.out.println(solution50.myPow(201.57, 9));
    }
}
