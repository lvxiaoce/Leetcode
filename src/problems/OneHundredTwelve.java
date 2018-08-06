package problems;

import utils.TreeNode;

import java.util.Stack;

/**
 * 第一百一十二题：路径总和
 *
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *         5
 *        / \
 *       4   8
 *      /   / \
 *     11  13  4
 *    /  \      \
 *   7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 */
public class OneHundredTwelve {


    /**
     * 递归相减
     *
     * 递归一次,减去当前节点值,到最后一个节点判断两个值相减是否等于0
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) return false;

        if(root.left == null && root.right == null && sum - root.val == 0) return true;

        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }

    /**
     * 堆栈循环方法
     *
     * @param root
     * @param sum
     * @return
     *
     */
    public boolean hasPathSum1(TreeNode root, int sum) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<Integer> sums = new Stack<Integer>();
        stack.push(root);
        sums.push(sum);
        while(!stack.isEmpty()&&(root!=null)){
            int value = sums.pop();
            TreeNode top = stack.pop();

            if(top.left==null&&top.right==null&&top.val==value){
                return true;
            }
            if(top.right!=null){
                stack.push(top.right);
                sums.push(value-top.val);
            }
            if(top.left!=null){
                stack.push(top.left);
                sums.push(value-top.val);
            }

        }
        return false;
    }
}
