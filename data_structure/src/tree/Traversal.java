package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Traversal {
	
	//方法 1：迭代,深度优先搜索
    //从根节点开始，每次迭代弹出当前栈顶元素，并将其孩子节点压入栈中，先压右孩子再压左孩子。
  //在这个算法中，输出到最终结果的顺序按照 Top->Bottom 和 Left->Right，符合前序遍历的顺序。
//	时间复杂度：访问每个节点恰好一次，时间复杂度为 O(N)O(N) ，其中 NN 是节点的个数，也就是树的大小。
//	空间复杂度：取决于树的结构，最坏情况存储整棵树，因此空间复杂度是 O(N)O(N)。

	
	 public List<Integer> preorderTraversal(TreeNode root) {
		 List<Integer> result=new ArrayList();
		 LinkedList<TreeNode> stack = new LinkedList<>();
		 if (root==null) return result;
	        
		 stack.push(root);
		 while(!stack.isEmpty()){
			 TreeNode node = stack.pop();
			 result.add(node.val);
			 //压右孩子进栈
			 if(node.right!=null){
				 stack.push(node.right);
			 }
			  if (node.left != null) {
			        stack.add(node.left);
			      }
		 }
		 return result;
		 
	    }
	 
	 //中序遍历 ，使用迭代
	 //时间复杂度：O(n)O。

   //空间复杂度：O(n))。

	 
	 public List<Integer> Traversal(TreeNode root) {
		 List<Integer> result=new ArrayList();
		 LinkedList<TreeNode> stack = new LinkedList<>();
		 if (root==null) return result;
		 TreeNode temp=root;
		 while(!stack.isEmpty()|| temp!=null){
			 
			 while(temp!=null){   //左节点全部入栈
				 stack.push(temp);
				 temp=temp.left;
			 }
			 
			 temp = stack.pop();
			 result.add(temp.val);
			 //压右孩子进栈
			 temp=temp.right;
		 }
		 return result;
		 
	    }
	 
	 
	 //使用递归
	 
	 public List < Integer > inorderTraversal(TreeNode root) {
	        List < Integer > res = new ArrayList < > ();
	        helper(root, res);
	        return res;
	    }

	    public void helper(TreeNode root, List < Integer > res) {
	        if (root == null) return;
	        if (root.left != null) {
	                helper(root.left, res);
	          }
	            res.add(root.val);
	            if (root.right != null) {
	                helper(root.right, res);
	            }
	        
	    }
	    
	    
	    
	    //后序遍历,使用迭代
	    //从根节点开始依次迭代，弹出栈顶元素输出到输出列表中，然后依次压入它的所有孩子节点，按照从上到下、从左至右的顺序依次压入栈中。

   //因为深度优先搜索后序遍历的顺序是从下到上、从左至右，所以需要将输出列表逆序输出。
//其实就是根-右-左的逆序

	    
	    public List<Integer> postorderTraversal(TreeNode root) {
	        LinkedList<TreeNode> stack = new LinkedList<>();
	        LinkedList<Integer> output = new LinkedList<>();
	        if (root == null) {
	          return output;
	        }

	        stack.add(root);
	        while (!stack.isEmpty()) {
	          TreeNode node = stack.pollLast();
	          output.addFirst(node.val);
	          if (node.left != null) {
	            stack.add(node.left);
	          }
	          if (node.right != null) {
	            stack.add(node.right);
	          }
	        }
	        return output;
	      }	 
}
