package problems;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 第一百零七题：二叉树的层次遍历
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 返回其自底向上的层次遍历为：
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */
public class OneHundredSeven {
    /**
     * DFS算法
     * 利用队列循环
     * 将二叉树放入队列中循环 判断队列是否为空
     * 初始化int类型作为当前的深度 初始化数组存储数据
     * 循环当前深度次数 判断该节点的左右节点是否为空 不为空放入队列中 然后将该节点的值拿出 放入当前深度的list中
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i <levelNum; i++) {
                if(queue.peek().left !=null) queue.offer(queue.peek().left);
                if(queue.peek().right !=null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            list.add(0,subList);
        }
        return list;
    }
}
