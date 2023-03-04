package editor.cn;

/**
 *题目id：206
 *题目：反转链表
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
    //递归
    public ListNode reverseList(ListNode head) {
       return reverse(null,head);
    }
    private ListNode reverse(ListNode pre,ListNode cur){
        //cur一开始指向头结点，在往后移动的过程中，直至cur到null，说明翻转完成，此时cur=null；即可返回
        if (cur==null){
            return pre;
        }
        ListNode temp=cur.next;
        cur.next=pre;
        /**
         * pre=cur；cur=temp
         */
        return reverse(cur,temp);
    }
}
//leetcode submit region end(Prohibit modification and deletion)
