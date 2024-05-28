package dfs;

public class MyTreeNode {
	int data;
	MyTreeNode leftChild;
	MyTreeNode rightChild;
	public MyTreeNode(int data) {
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
	public MyTreeNode getLeftChild() {
		return leftChild;
	}
	public void setLeftChild(MyTreeNode leftChild) {
		this.leftChild = leftChild;
	}
	public MyTreeNode getRightChild() {
		return rightChild;
	}
	public void setRightChild(MyTreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	
}
