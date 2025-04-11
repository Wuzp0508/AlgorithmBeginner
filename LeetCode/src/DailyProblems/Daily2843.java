package DailyProblems;

/**
 * 2843. Count Symmetric Integers
 */

class Solution2843 {
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for (int i = low; i <= high; ++i) {
            if (i < 100 && i % 11 == 0) {
                ++res;
            } else if (1000 <= i && i < 10000) {
                int left = i / 1000 + (i % 1000) / 100;
                int right = (i % 100) / 10 + i % 10;
                if (left == right) {
                    ++res;
                }
            }
        }
        return res;
    }
}

public class Daily2843 {
    public static void main(String[] args) {
        Solution2843 solution = new Solution2843();
        System.out.println(solution.countSymmetricIntegers(1, 10000));
    }
}
