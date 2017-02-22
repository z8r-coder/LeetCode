
public class SameTree {
	private boolean flag = true;
	public boolean isSameTree(TreeNode p,TreeNode q) {
		if (p != null && q != null) {
			if (p.val == q.val) {
				isSameTree(p.left, q.left);
				isSameTree(p.right, q.right);
			}
			else {
				flag = false;
			}
		}
		else if (p == null && q == null) {
			
		}
		else {
			flag = false;
		}
		if (flag) {
			return true;
		}
		else {
			return false;
		}
	}
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			// TODO Auto-generated constructor stub
			val = x;
		}
	}
}
