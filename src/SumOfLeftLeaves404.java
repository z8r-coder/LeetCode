
/*404*/
public class SumOfLeftLeaves404 {
	private int temp = 0;
	public boolean isLeaf(TreeNode root) {
		if (root == null) {
			return false;
		}else {
			if (root.left == null && root.right == null) {
				return true;
			}else{
				return false;
			}
		}
	}
    public int sumOfLeftLeaves(TreeNode root) {
    	if (root == null) {
    		return 0;
		}else {
			if (isLeaf(root.left)) {
				temp = temp + root.left.val;
				sumOfLeftLeaves(root.right);
			}else {
				sumOfLeftLeaves(root.left);
				sumOfLeftLeaves(root.right);
			}
		}
    	return temp;
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
