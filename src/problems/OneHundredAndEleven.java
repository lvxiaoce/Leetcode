package problems;

import utils.TreeNode;

/**
 * 第一百一十一题：二叉树的最小深度
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最小深度  2.
 */
public class OneHundredAndEleven {

    /**
     * 递归 每调用一次+1
     * 当左或者右等于0的时候(这时候没必要继续算了)
     * 返回另一个值+1
     * @param root
     * @return
     */
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left==0 || right ==0)?right+left+1:Math.min(left,right)+1;
    }

}
