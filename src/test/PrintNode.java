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
	    	TreeNode tempNode=s.pop();  //������Ԫ��
	    	if(tempNode!=null) {
	    		resultList.add(tempNode.val);//���ʸ��ڵ�
                s.push(tempNode.right); //��ջ�Һ���
                s.push(tempNode.left);//��ջ����
	
	    	}
	    	
	    }
		

		return resultList;
        //ǰ�����
        
        
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
	        int levelNum=0;//��¼ĳ����ж��ٸ��ڵ�
	        Queue<TreeNode> treeQueue=new LinkedList<>(); // ����һ������
	        treeQueue.add(root);
	        while(!treeQueue.isEmpty()){
	            levelNum=treeQueue.size();
	            List<Integer> levelList=new ArrayList<>();
	            while(levelNum>0){
	                TreeNode tempNode=treeQueue.poll();  //������һ��Ԫ��
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
