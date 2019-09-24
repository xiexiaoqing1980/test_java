package test;

public class BinaryTree {
	public TreeNode root = null;

    public BinaryTree(int[] array, int index) {
        root = createBinaryTree(array, index);
    }

	private TreeNode createBinaryTree(int[] array, int index) {
		// TODO Auto-generated method stub
		TreeNode treeNode=null;
		if(index<array.length) {
			 treeNode = new TreeNode(array[index]);
			 treeNode.left = createBinaryTree(array, 2 * index + 1);
	          treeNode.right = createBinaryTree(array, 2 * index + 2);
			 
		}
		
		return treeNode;
	}
	

}


 class TreeNode {
	   int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	 }