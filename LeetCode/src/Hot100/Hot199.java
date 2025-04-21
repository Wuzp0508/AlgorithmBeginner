package Hot100;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 199. Binary Tree Right Side View
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
    TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left = left; this.right = right; }
}

class Pair {
    TreeNode node;
    int depth;
    Pair(TreeNode node, int depth) { this.node = node; this.depth = depth; }
}

class Solution199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<Pair> queue = new ArrayDeque<>();
        queue.add(new Pair(root, 0));
        while (!queue.isEmpty()) {
            Pair p = queue.poll();
            if (p.node.left != null) {
                queue.add(new Pair(p.node.left, p.depth + 1));
            }
            if (p.node.right != null) {
                queue.add(new Pair(p.node.right, p.depth + 1));
            }
            if (!queue.isEmpty() && p.depth != queue.peek().depth) {
                res.add(p.node.val);
            }
        }
        return res;
    }
}

public class Hot199 {
    public static void main(String[] args) {
        Solution199 solution = new Solution199();
        System.out.println(solution.rightSideView(new TreeNode(1)));
    }
}
