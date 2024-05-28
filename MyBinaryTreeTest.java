package dfs;

import dfs.MyTreeNode;

public class MyBinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinaryTree tree = new MyBinaryTree();
		tree.root = new MyTreeNode(1);
		tree.root.leftChild = new MyTreeNode(2);
		tree.root.rightChild = new MyTreeNode(3);
		
		tree.root.leftChild.leftChild = new MyTreeNode(4);
		tree.root.leftChild.rightChild = new MyTreeNode(5);
		
		tree.root.rightChild.leftChild = new MyTreeNode(6);
		tree.root.rightChild.rightChild = new MyTreeNode(7);
		
		tree.dfs(tree.root);//1번노드객체
	}

}
