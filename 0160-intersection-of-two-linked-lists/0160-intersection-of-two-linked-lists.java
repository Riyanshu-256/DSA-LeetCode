/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
import java.util.HashSet;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // code here

        // Create a hashset to store node's val
        HashSet<ListNode> set = new HashSet<>();

        // store the value of listA into set
        ListNode curr = headA;
        while(curr != null){
            set.add(curr);
            curr = curr.next;
        }

        // Check whether node's val is present in set or not. if prsent then return curr otherwise move forward
        curr = headB;
        while(curr != null){
            if(set.contains(curr)){
                return curr;
            }
            curr = curr.next;
        }

        // if intersection not found return null
        return null;
    }
}