package problems;

import utils.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 第一百一十题:平衡二叉树
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
 *
 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 *    3
 *   / \
 *  9  20
 *    /  \
 *   15   7
 * 返回 true 。
 *
 * 示例 2:
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 */
public class OneHundredAndTen {
    /**
     * 递归方法,取每个子节点的左右两个节点深度相减，看是否小于一
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if(root.left == null && root.right == null) return true;
        return Math.abs(maxDeth(root.left)-maxDeth(root.right))<=1 && isBalanced(root.right) && isBalanced(root.left);
    }


    private static int maxDeth(TreeNode t){
        if(t == null) return 0;
        int maxleft = t.left == null?0:maxDeth(t.left);
        int maxright = t.right == null?0:maxDeth(t.right);
        return 1+Math.max(maxleft,maxright);
    }
}
