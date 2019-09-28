package tree;

import java.util.LinkedList;
import java.util.Stack;

public class BinarySearchTree2 {
	//通过使用栈，上面的递归法可以转化为迭代法。这里使用深度优先搜索，比广度优先搜索要快一些。
	
	LinkedList<TreeNode> stack = new LinkedList();
	  LinkedList<Integer> uppers = new LinkedList(),lowers = new LinkedList();

	  public void update(TreeNode root, Integer lower, Integer upper) {
	    stack.add(root);
	    lowers.add(lower);
	    uppers.add(upper);
	  }

	  public boolean isValidBST(TreeNode root) {
	    Integer lower = null, upper = null, val;
	    update(root, lower, upper);

	    while (!stack.isEmpty()) {
	      root = stack.poll();
	      lower = lowers.poll();
	      upper = uppers.poll();

	      if (root == null) continue;
	      val = root.val;
	      if (lower != null && val <= lower) return false;
	      if (upper != null && val >= upper) return false;
	      update(root.right, val, upper);
	      update(root.left, lower, val);
	    }
	    return true;
	  }

	
	//方法二: 中序遍历
//	左子树 -> 结点 -> 右子树 意味着对于二叉搜索树而言，每个元素都应该比下一个元素小。
	  //时间复杂度 : 最坏情况下（树为二叉搜索树或破坏条件的元素是最右叶结点）为 {O}(N)O(N)。

  //空间复杂度 : {O}(N) 用于存储 stack。

	  public boolean isValidBST2(TreeNode root) {
		    LinkedList<TreeNode> stack = new LinkedList();
		    double inorder = - Double.MAX_VALUE;  //这是一个细节，选取一个最小值

		    while (!stack.isEmpty() || root != null) {
		      while (root != null) {
		        stack.push(root);
		        root = root.left;   //左子树进栈
		      }
		      root = stack.pop();   //依次弹出元素
		      // If next element in inorder traversal
		      // is smaller than the previous one
		      // that's not BST.
		      if (root.val <= inorder) return false;
		      inorder = root.val;
		      root = root.right;
		    }
		    return true;
		  }

	
	

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
