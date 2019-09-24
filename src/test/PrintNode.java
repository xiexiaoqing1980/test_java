package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class PrintNode {
	public static void main(String[] args) {
		BinaryTree b1=new BinaryTree(new int[] {1,2,3,4,5},0);
		List result=levelOrder(b1.root);
		for (Object object : result) {
			System.out.println(object);
		}
		
		
	}
	
	
	public List<Integer> preorderTraversal(TreeNode root) {
		
		Stack<TreeNode> s=new Stack();
		List<Integer> resultList=new ArrayList<>();
		if(root==null) {
			return  resultList;
					
		}
		s.push(root);
		
	    while(!s.isEmpty()) {
	    	TreeNode tempNode=s.pop();  //弹出跟元素
	    	if(tempNode!=null) {
	    		resultList.add(tempNode.val);//访问根节点
                s.push(tempNode.right); //入栈右孩子
                s.push(tempNode.left);//入栈左孩子
	
	    	}
	    	
	    }
		

		return resultList;
        //前序遍历
        
        
    }
	
	public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }

	 public  static List<List<Integer>> levelOrder(TreeNode root) {
	        List<List<Integer>> resultList=new ArrayList<>();
	        int levelNum=0;//记录某层具有多少个节点
	        Queue<TreeNode> treeQueue=new LinkedList<>(); // 创建一个队列
	        treeQueue.add(root);
	        while(!treeQueue.isEmpty()){
	            levelNum=treeQueue.size();
	            List<Integer> levelList=new ArrayList<>();
	            while(levelNum>0){
	                TreeNode tempNode=treeQueue.poll();  //弹出第一个元素
	                if(tempNode!=null){
	                    levelList.add(tempNode.val);
	                    treeQueue.offer(tempNode.left); 
	                    treeQueue.offer(tempNode.right);
	                }
	                levelNum--;
	            }
	            if(levelList.size()>0) 
	                resultList.add(levelList);
	        }
	        return resultList;        
	    }

}
