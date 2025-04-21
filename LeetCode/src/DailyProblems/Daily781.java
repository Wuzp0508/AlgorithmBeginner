package DailyProblems;

import java.util.HashMap;
import java.util.Map;

/**
 * 781. Rabbits in Forest
 */

class Solution781 {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int x : answers) {
            cnt.put(x, cnt.getOrDefault(x, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            int key = entry.getKey(), val = entry.getValue();
            res += (int)(Math.ceil(val / (key + 1.0))) * (key + 1);
        }
        return res;
    }
}

public class Daily781 {
    public static void main(String[] args) {
        Solution781 solution = new Solution781();
        System.out.println(solution.numRabbits(new int[]{1, 2, 3, 4, 5}));
    }
}
