package bfsAnddfs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;


public class BFS {
	//迭代法：
	//时间复杂度：O(N)O(N)，因为每个节点恰好会被运算一次。
//	空间复杂度：O(N)O(N)，保存输出结果的数组包含 N 个节点的值。
	public List<List<Integer>> Bfs(TreeNode root) {
		List<List<Integer>> result=new ArrayList<>();
		Set<TreeNode> Visted=new HashSet<>();  //在图中需要注意是否重复访问
		Queue<TreeNode> queue=new LinkedList();
		if (root==null) return result;
		queue.add(root);
		Visted.add(root);
		int level=0;
		while(!queue.isEmpty()){
			result.add(new ArrayList<Integer>());
			int size=queue.size();
			for(int i=0;i<size;i++){
				TreeNode node=queue.poll();
				Visted.add(node);
				// fulfill the current level
				result.get(level).add(node.val);
				// add child nodes of the current level
		        // in the queue for the next level
				if (node.left!=null && !Visted.contains(node.left)) {
					queue.add(node.left);
				}
				if (node.right!=null&&!Visted.contains(node.right)) {
					queue.add(node.right);
				}
			}
			level++;   //go to next level
		}
		return result;
	}
	
	//方法二：递归
	 List<List<Integer>> levels = new ArrayList<List<Integer>>();
	 public List<List<Integer>> Bfs2(TreeNode root){
		 if (root==null) return levels;
		 helper(root,0);
		 return levels;
	 }
	private void helper(TreeNode node, int level) {
		// TODO Auto-generated method stub
		if (levels.size()==level) 
			levels.add(new ArrayList<>());
			levels.get(level).add(node.val);
			if (node.left != null)
	            helper(node.left, level + 1);
	         if (node.right != null)
	            helper(node.right, level + 1);
	}
	
}



class TreeNode {
	   int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	 }
