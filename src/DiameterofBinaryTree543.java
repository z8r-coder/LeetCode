
public class DiameterofBinaryTree543 {
	public int diameterOfBinaryTree(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = diameterOfBinaryTree(root.left);
		int right = diameterOfBinaryTree(root.right);
		int height1 = getHeight(root.left);
		int height2 = getHeight(root.right);
		
		int tmp1 = right > left ? right:left;
		int tmp2 = height1 + height2;
		return tmp1 > tmp2?tmp1 : tmp2;
	}

	int getHeight(TreeNode root){
		if (root == null) {
			return 0;
		}
		return 1 + max(getHeight(root.left), getHeight(root.right));
	}
	
	int max(int a, int b){
		if (a >= b) {
			return a;
		}else {
			return b;
		}
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
