
public class OddEvenLinkedList328 {
	public ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = head.next;
		while (odd.next != null && even.next != null) {
			odd.next = even.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
		}
		odd.next = evenHead;

		return head;

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
