
public class InvertBinaryTree226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
			return null;
		}
    	invertTree(root.left);
    	invertTree(root.right);
    	TreeNode temp_node = root.left;
    	root.left = root.right;
    	root.right = temp_node;
        return root;
    }
    public class TreeNode {
    	 int val;
    	 TreeNode left;
    	 TreeNode right;
         TreeNode(int x) { val = x; }
    }
}
