package problems;

/**
 * 第二十一题：合并两个有序链表
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class TwentyOne {
    class ListNode{
        int val;
        ListNode nextNode;
        ListNode(int val){
            this.val=val;
            this.nextNode=null;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        return new ListNode(0);
    }
}
