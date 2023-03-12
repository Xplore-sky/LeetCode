package editor.cn;
/**
 *题目id：19
 *题目：删除链表的倒数第 N 个结点
 *@author Elvis
 */
//leetcode submit region begin(Prohibit modification and deletion)

  //Definition for singly-linked list.
/*   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }*/
class Solution {
    /**
     * 总的思想
     * 让快指针先往前移动，只要快慢指针相差n个节点
     * 先让快指针移n+1个节点，之后快慢指针同时移动，直到快指针移动到空
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //创建一个虚拟头节点,并指向头节点
        ListNode dummyNode=new ListNode(0,head);

        //创建快慢指针
        ListNode fast=dummyNode;
        ListNode slow=dummyNode;

        //移动n个节点
        for (int i = 0; i < n+1; i++) {
            fast=fast.next;
        }
      /*  //在移动一个节点
        fast=fast.next;*/
       //快慢指针同时移动
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummyNode.next;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
