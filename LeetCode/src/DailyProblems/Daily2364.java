package DailyProblems;

import java.util.*;

class Solution2364 {
    public long countBadPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        long res = 0;
        for (int i = 0; i < nums.length; ++i) {
            int key = nums[i] - i;
            res += i - map.getOrDefault(key, 0);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        return res;
    }
}

public class Daily2364 {
    public static void main(String[] args) {
        Solution2364 sol = new Solution2364();
        System.out.println(sol.countBadPairs(new int[]{1,2,3,4}));
    }
}
