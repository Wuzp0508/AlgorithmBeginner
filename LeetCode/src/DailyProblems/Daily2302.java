package DailyProblems;

/**
 * 2302. Count Subarrays With Score Less Than K
 */

class Solution2302 {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long res = 0, sum = 0;
        for (int left = 0, right = 0; right < n; ++right) {
            sum += nums[right];
            while (left <= right && (right - left + 1) * sum >= k) {
                sum -= nums[left++];
            }
            res += right - left + 1;
        }
        return res;
    }
}

public class Daily2302 {
}
