package bfs;

import java.util.LinkedList;
import java.util.Queue;

public class MyBinaryTreeBFS {
	BFSTreeNode root;
	public void bfs(BFSTreeNode root) {
		Queue<BFSTreeNode> myqueue = new LinkedList<>();
		myqueue.offer(root);
		int level = 0;
		while(!myqueue.isEmpty()) {
			int size = myqueue.size();
			System.out.println(level+":"+size);
			for(int i=0; i<size; i++) {
				BFSTreeNode currentNode = myqueue.poll();
				System.out.print(currentNode.data+" ");
				if(currentNode.leftChild!=null) {
					myqueue.offer(currentNode.leftChild);
				}
				if(currentNode.rightChild!=null) {
					myqueue.offer(currentNode.rightChild);
				}
			}
			level++;
			System.out.println();
		}
	}
}
