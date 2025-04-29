package DailyProblems;

import java.util.Arrays;

/**
 * 2962. Count Subarrays Where Max Element Appears at Least K Times
 */

class Solution2962 {
    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int n = nums.length, left = 0, right = 0, count = 0;
        long res = 0;
        while (right < n) {
            if (nums[right] == max) {
                ++count;
            }
            while (count >= k) {
                res += n - right;
                if (nums[left] == max) {
                    --count;
                }
                ++left;
            }
            ++right;
        }
        return res;
    }
}

public class Daily2962 {
}
