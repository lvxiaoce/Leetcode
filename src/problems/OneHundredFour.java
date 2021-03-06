package problems;

import utils.TreeNode;

/**
 * 第一百零四题：二叉树最大深度
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 */
public class OneHundredFour {
    /**
     * 一直往下递归
     * 每次递归判断 左和右节点是否为空 求出左和右节点的深度
     * 比较左和右节点的大小并加1
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftMax = root.left == null?0:maxDepth(root.left);
        int rightMax = root.right == null?0:maxDepth(root.right);
        return 1+Math.max(leftMax,rightMax);
    }
}
