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
    public ListNode mergeKLists(ListNode[] lists) {
        // code here

        List<Integer> list = new ArrayList<>();

        // store all values
        for(ListNode head : lists){
            while( head != null){
                list.add(head.val);
                head = head.next;
            }
        }

        // Sort the values
        Collections.sort(list);

        // Create new Linked list
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for(int num : list){
            curr.next = new ListNode(num);
            curr = curr.next;
        }

        return dummy.next;
    }
}