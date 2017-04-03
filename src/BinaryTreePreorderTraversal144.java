import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal144 {
	List<Integer> list = new ArrayList<>();
	class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		public TreeNode(int x) {
			// TODO Auto-generated constructor stub
			val = x;
		}
	}
    public List<Integer> preorderTraversal(TreeNode root) {
    	if (root == null) {
			return list;
		}
    	list.add(root.val);
    	preorderTraversal(root.left);
    	preorderTraversal(root.right);
        return list;
    }
}
