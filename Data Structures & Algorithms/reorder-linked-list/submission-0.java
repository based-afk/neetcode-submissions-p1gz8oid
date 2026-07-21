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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        List<ListNode> ls = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            ls.add(current);
            current = current.next;
        }
        ArrayList<ListNode> copy = new ArrayList<>(ls);
        int i = 0, j = copy.size() - 1, k = 0;
        while (i < copy.size()) {
            if (i % 2 == 0) {
                ls.set(i++, copy.get(k++));
            } else {
                ls.set(i++, copy.get(j--));
            }
        }
        
        current = head;
        i = 0;
        ListNode curr = null;
        while (i++ < ls.size() - 1) {
            curr = ls.get(i);
            current.next = curr;
            current = current.next;

        }
        curr.next = null;

    }
}