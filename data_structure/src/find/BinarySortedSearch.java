package find;

public class BinarySortedSearch {
	
	public static boolean BinarySortedSearch1( TreeNode root,int target) {
		
		if (root==null) return false; 
		if (root.val==target) {
			return true;
		}
		if (root.val>target) {
			return BinarySortedSearch1(root.left, target);
			
		}else {
			return BinarySortedSearch1(root.right, target);
		}
		
		
	}

}


class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode(int val) {
		super();
		this.val = val;
	}
	
}