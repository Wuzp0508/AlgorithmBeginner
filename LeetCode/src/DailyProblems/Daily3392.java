package DailyProblems;

/**
 * 3392. Count Subarrays of Length Three With a Condition
 */

class Solution3392 {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int res = 0;
        for (int i = 1; i < n - 1; ++i) {
            if (nums[i] == (nums[i - 1] + nums[i + 1]) * 2) {
                ++res;
            }
        }
        return res;
    }
}

public class Daily3392 {
}
