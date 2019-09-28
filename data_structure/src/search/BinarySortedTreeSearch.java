package search;

public class BinarySortedTreeSearch {
	
	 //递归实现二叉树查找
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
		
public static boolean BinarySortedSearch2( TreeNode root,int target) {
			
			TreeNode temp=root;
			while (temp!=null) {
				if (temp.val==target) {
					return true;
				}else if (temp.val>target) {
					temp=temp.left;
				}else {
					temp=temp.right;
				}
			}
			
			return false;
			
		}
			
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
}
