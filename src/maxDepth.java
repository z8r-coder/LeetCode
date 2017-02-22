
public class maxDepth {
	public int max(int a,int b){
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		else {
			return 1 + max(maxDepth(root.left),maxDepth(root.right));
		    
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
