package DailyProblems;

/**
 * 1922. Count Good Numbers
 */

class Solution1922 {
    private final long MOD = 1000000007;

    public int countGoodNumbers(long n) {
        return (int)(quickMultiple(5, (n + 1) / 2) * quickMultiple(4, n / 2) % MOD);
    }

    private long quickMultiple(int x, long n) {
        if (n == 0) {
            return 1;
        }
        long y = quickMultiple(x, n / 2);
        return n % 2 == 0 ? y * y % MOD : y * y * x % MOD;
    }
}

public class Daily1922 {
    public static void main(String[] args) {
        Solution1922 solution = new Solution1922();
        System.out.println(solution.countGoodNumbers(50));
    }
}
