/**
 * Implements a BST. 
 * @author Chaitanya Bilgikar
 */
package treeNodePackage;

public class Tree {

	private TreeNode root;
	private boolean isEmpty;

	public TreeNode getRoot() {
		return root;
	}

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public Tree insert(Tree tree, TreeNode node) {
		if (tree.isEmpty()) {
			tree.setRoot(node);
			tree.setEmpty(false);
		} else {
			TreeNode currentNode = tree.getRoot();
			while (currentNode != null) {
				if (node.getData() > currentNode.getData()) {
					if (currentNode.getRightChild() == null) {
						currentNode.setRightChild(node);
						break;
					} else {
						currentNode = currentNode.getRightChild();
					}
				} else {
					if (currentNode.getLeftChild() == null) {
						currentNode.setLeftChild(node);
						break;
					} else {
						currentNode = currentNode.getLeftChild();
					}
				}
			}

		}
		return tree;
	}

	public Tree(TreeNode root) {
		this.setRoot(root);
		this.setEmpty(false);
	}

	public Tree() {
		this.setRoot(null);
		this.setEmpty(true);
	}

}
