import java.util.Random;

public class LinkedListRandomNode382 {
	private ListNode head;
	public LinkedListRandomNode382(ListNode head) {
		// TODO Auto-generated constructor stub
		this.head = head;
	}
	public int getRandom() {
		Random random = new Random();
		int res = head.val;//res为大小为1的池塘
		int cur = 2;//第几个节点是否加入池塘
		ListNode cur_node = head.next;
		while(cur_node != null){
			int temp = random.nextInt(cur);//不包括参数本身
			if (temp == 0) {
				//替换入池塘
				res = cur_node.val;
			}
			cur_node = cur_node.next;
			cur++;
		}
		return res;
	}
	class ListNode {
		int val;
		ListNode next;
		public ListNode(int val) {
			// TODO Auto-generated constructor stub
			this.val = val;
		}
	}
}
