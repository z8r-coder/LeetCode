import java.util.ArrayList;
import java.util.List;

/*94*/
public class BinaryTreeInorderTraversal94 {
	List<Integer> lt = new ArrayList<>();
	private void inorder(TreeNode root) {
		if (root == null) {
			return;
		}else {
			inorder(root.left);
			lt.add(root.val);
			inorder(root.right);
		}
	}
	 public List<Integer> inorderTraversal(TreeNode root) {
	        inorder(root);
	        return lt;
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
