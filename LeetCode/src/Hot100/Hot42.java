package Hot100;

/**
 * 42. Trapping Rain Water
 */

class Solution42 {
    public int trap(int[] height) {
        int res = 0;
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (height[left] < height[right]) {
                res += leftMax - height[left];
                ++left;
            } else {
                res += rightMax - height[right];
                --right;
            }
        }
        return res;
    }
}

public class Hot42 {
    public static void main(String[] args) {
        Solution42 solution = new Solution42();
        System.out.println(solution.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}
