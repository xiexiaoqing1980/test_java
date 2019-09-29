package bfsAnddfs;

public class MaxDepth {
	
	//深度搜索，递归
//	复杂度分析
//
//	时间复杂度：我们每个结点只访问一次，因此时间复杂度为 O(N)，
//	其中 N是结点的数量。
//	空间复杂度：在最糟糕的情况下，树是完全不平衡的，例如每个结点只剩下左子结点，递归将会被调用 N 次（树的高度），因此保持调用栈的存储将是 O(N)O(N)。但在最好的情况下（树是完全平衡的），树的高度将是 \log(N)。因此，在这种情况下的空间复杂度将是 O(\log(N))。
	
	 public int maxDepth(TreeNode root) {
	        if(root==null) return 0;
	        int left=maxDepth(root.left);
	        int right=maxDepth(root.right);
	        return Math.max(left, right)+1;  
	        
	    }

}
