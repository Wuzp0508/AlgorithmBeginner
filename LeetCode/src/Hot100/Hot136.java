package Hot100;

/**
 * 136. Single Number
 */

class Solution136 {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;
        }
        return single;
    }
}

public class Hot136 {
    public static void main(String[] args) {
        Solution136 solution = new Solution136();
        System.out.println(solution.singleNumber(new int[]{1,2,2,1}));
    }
}
