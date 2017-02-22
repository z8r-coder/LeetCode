import java.util.Stack;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
    	if (head == null) {
			return null;
		}
    	if (head.next == null) {
			return head;
		}
    	ListNode p = head.next;
    	ListNode n = reverseList(p);
    	head.next = null;
    	p.next = head;
        return n;
    }
    class ListNode {
   	 int val;
   	 ListNode next;
   	 ListNode(int x) { val = x; }
   }
}
