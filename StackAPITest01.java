package datastructor;

import java.util.Stack;

//자바에서 stack을 사용하기 위해서 알아야 할 문법
public class StackAPITest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<>();
		//스택에 데이터를 저장하기
		stack.push("java");
		stack.push("servlet");
		stack.push("jsp");
		stack.push("spring");
		
		System.out.println("스택에 저장된 요소의 갯수=>"+stack.size());
		System.out.println("스택에 저장된 요소가 있나?=>"+stack.empty());//스택에 저장된 요소가 없을때 true를 리턴
		
		System.out.println("스택에 마지막으로 저장된 요소를 확인=>"+stack.peek());
		System.out.println("스택에 저장된 요소의 갯수=>"+stack.size());
		
		System.out.println("스택에서 데이터 꺼내기=>"+stack.pop());
		System.out.println("스택에서 데이터 꺼내기=>"+stack.pop());
		System.out.println("스택에서 데이터 꺼내기=>"+stack.pop());
		System.out.println("스택에서 데이터 꺼내기=>"+stack.pop());
		System.out.println("스택에 저장된 요소의 갯수=>"+stack.size());
		System.out.println("스택에 저장된 요소가 있나?=>"+stack.empty());
		
		System.out.println("스택에 마지막으로 저장된 요소를 확인=>"+stack.peek());
	}

}
