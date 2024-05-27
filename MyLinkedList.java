package datastructor.linked;

public class MyLinkedList<E> {
	private MyNode<E> head;
	int size;
	public MyLinkedList() {
		head = null;
		size = 0;
	}
	public MyNode<E> add(E data){
		MyNode<E> newNode = null;
		if(head==null) {
			newNode = new MyNode<>(data);
			head = newNode;
		}else {
			newNode = new MyNode<>(data);
			MyNode<E> tempNode = head;
			while(tempNode.nextNode!=null) {
				tempNode = tempNode.nextNode;
			}
			tempNode.nextNode = newNode;
		}
		size ++;
		return newNode;
	}
	public void printAll() {
		MyNode<E> tempNode = head;
		while(tempNode.nextNode!=null) {
			tempNode = tempNode.nextNode;
			if(tempNode!=null) {
				System.out.println("->");
			}
		}
		System.out.println();
	}
	public boolean isEmpty() {
		if(head==null) {
			return true;
		}else {
			return false;
		}
	}
	public int getSize() {
		return size;
	}
	public void removeAll() {
		head = null;
		size = 0;
	}
	public MyNode<E> insert(int position, E data) {
		//첫번째 노드부터 순회하며 삽입될 위치로 찾아가야함
		MyNode<E> tempNode = head;
		MyNode<E> newNode = new MyNode<>(data);
		if(position == 0) {
			newNode.nextNode = head;
			head = newNode;
		}else {
			MyNode<E> preNode = null;
			//삽입될 위치의 이전 노드의 포지션을 찾아 작업하기
			for(int i=0; i<position;i++) {
				preNode = tempNode;
				tempNode = tempNode.nextNode;
			}
			//새로삽입되는 노드의 다음노드를 삽입될 위치 이전노드가 참조하는 다음노드를 변경
			newNode.nextNode = preNode.nextNode;
			//삽입될 위치의 이전노드가 새로 만들어진 노드를 참조하도록 변경
			preNode.nextNode = newNode;
		}
		size++;
		return newNode;
	}
	public MyNode<E> remove(int position){
		MyNode<E> tempNode = head;
		//맨 앞의 노드를 삭제하는 경우
		if(position==0) {
			head = tempNode.nextNode;
		}else {
			MyNode<E> preNode = null;
			for(int i=0; i<position;i++) {
				preNode = tempNode;
				tempNode = tempNode.nextNode;
			}
			preNode.nextNode = tempNode.nextNode;
		}
		size--;
		System.out.println(position+"항목이 삭제");
		return tempNode;
	}
}
