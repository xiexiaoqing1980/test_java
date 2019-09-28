package tree;

public class BinarySearchTree {
	
	
	//方法一: 递归
//	复杂度分析
//
//	时间复杂度 : O(N)。每个结点访问一次。
//	空间复杂度 : O(N)。我们跟进了整棵树。
	public boolean isValidBST(TreeNode root) {
	    return helper(root, null, null);
	  }

	private boolean helper(TreeNode node, Integer low, Integer high) {
		// TODO Auto-generated method stub
		if (node==null)  return true;//空树也是二叉搜索树
		int val=node.val;
		if (low!=null&& val<=low) return false;
		if(high!=null&& val>high)return false;
		

	    if (! helper(node.right, val, high)) return false;
	    if (! helper(node.left, low, val)) return false;
	    return true;
		
	}
	
	//方法二: 迭代
//	通过使用栈，上面的递归法可以转化为迭代法。这里使用深度优先搜索，比广度优先搜索要快一些。
	
	
	
	

}

//  class TreeNode {
//	  int val;
//	  TreeNode left;
//	  TreeNode right;
//
//	  TreeNode(int x) {
//	    val = x;
//	  }
//	}
