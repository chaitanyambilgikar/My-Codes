package treeNodePackage;

public class Traversals {
	
	public void inOrderTraversal(TreeNode node)
	{
		if(node != null)
		{
			inOrderTraversal(node.getLeftChild());
			System.out.print(node.getData() + " ");
			inOrderTraversal(node.getRightChild());
		}
	}
	
	public void preOrderTraversal(TreeNode node)
	{
		if(node != null)
		{
			System.out.print(node.getData() + " ");
			preOrderTraversal(node.getLeftChild());
			preOrderTraversal(node.getRightChild());
		}
	}
	
	public void postOrderTraversal(TreeNode node)
	{
		if(node != null)
		{
			postOrderTraversal(node.getLeftChild());
			postOrderTraversal(node.getRightChild());
			System.out.print(node.getData() + " ");
		}
	}

}
