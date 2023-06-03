/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int pt=k;
        ListNode list1 = head;
        ListNode list2 = head;
        while(pt>0){
            list1=temp;
            temp=temp.next;
            pt--;
        }
        while(temp!=null){
            temp=temp.next;
            list2=list2.next;
        }
        int tmp=list1.val;
        list1.val=list2.val;
        list2.val=tmp;
        return head;
    }
}