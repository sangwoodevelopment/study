package bfs;

public class BFSTreeNode {
	int data;
	BFSTreeNode leftChild;
	BFSTreeNode rightChild;
	public BFSTreeNode(int data) {
		super();
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
		
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BFSTreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(BFSTreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public BFSTreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(BFSTreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
