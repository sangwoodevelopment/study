package bfs;

public class MyBinaryTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBinaryTreeBFS tree = new MyBinaryTreeBFS();
		tree.root = new BFSTreeNode(1);
		tree.root.leftChild = new BFSTreeNode(2);
		tree.root.rightChild = new BFSTreeNode(3);
		
		tree.root.leftChild.leftChild = new BFSTreeNode(4);
		tree.root.leftChild.rightChild = new BFSTreeNode(5);
		
		tree.root.rightChild.leftChild = new BFSTreeNode(6);
		tree.root.rightChild.rightChild = new BFSTreeNode(7);
		
		tree.bfs(tree.root);//1번노드객체
	}

}
