package datastructor.linked;
//연결리스트에 저장될 데이터정보와 다음 연결될 노드의 정보를 갖고 있는 객체
//연결리스트에서 하나의 데이터정보를 담고 있는 객체를 모델링
public class MyNode<E> {
	private E data;
	MyNode<E> nextNode;
	public MyNode() {
		data = null;
		nextNode = null;
		
	}
	public MyNode(E data) {
		this.data = data;
		this.nextNode = null;
	}
	public MyNode(E data, MyNode<E> nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}
	public E getData() {
		return data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public MyNode<E> getNextNode() {
		return nextNode;
	}
	public void setNextNode(MyNode<E> nextNode) {
		this.nextNode = nextNode;
	}
	
}
