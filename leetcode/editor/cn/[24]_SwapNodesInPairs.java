package editor.cn;
/**
 *题目id：24
 *题目：两两交换链表中的节点
 *@author Elvis
 */
//leetcode submit region begin(Prohibit modification and deletion)

 // Definition for singly-linked list.
/*  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }*/

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dumyhead=new ListNode(-1,head);
        //dumyhead.next = head; // 将虚拟头结点指向head，这样方面后面做删除操作
        ListNode cur=dumyhead;//cur指向虚拟结点
        ListNode temp;
        ListNode firstnode;
        ListNode secondnode;
        while (cur.next != null && cur.next.next != null) {
            temp=cur.next.next.next;//第三个结点
            firstnode=cur.next;//第一个结点
            secondnode=cur.next.next;//第二个结点
            cur.next=secondnode;
            secondnode.next=firstnode;
            firstnode.next=temp;
            cur=firstnode;
        }
        return dumyhead.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
