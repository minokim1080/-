import java.util.HashSet;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Leet240306 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();

        if(head == null){
            return false;
        }

        return recursion(head, set);
    }

    public boolean recursion(ListNode head, HashSet<ListNode> set){
        if(head.next == null){
            return false;
        }

        set.add(head);
        if(set.contains(head.next)){
            return true;
        }

        return recursion(head.next, set);

    }
}
