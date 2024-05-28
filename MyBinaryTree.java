package dfs;

import dfs.MyTreeNode;

//깊이우선탐색을 위한 메소드
public class MyBinaryTree {
	MyTreeNode root;
	public void dfs(MyTreeNode root) {
			if(root==null) {
				return;//널이라는 의미는 터미널노드라는 의미이므로 재귀를 빠져나온다
			}else {
				//왼쪽노드와 오른쪽노드를 계속 탐색하면 내려가야 한다. 재귀를 써야한다.
				//System.out.print(root.data+" ");//전위순회
				dfs(root.leftChild);
				//System.out.print(root.data+" ");//중위순회
				dfs(root.rightChild);
				System.out.print(root.data+" ");//후위순회
				
			}
		}
	}

