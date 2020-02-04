package classes;


import java.util.EmptyStackException;

class Stack<T> {
	
	class Node<T> {
		
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data = data;
			}
	}
		
	private Node<T> top;
		
	// pop
		
	public T pop() {
		
		if(top == null) {
			throw new EmptyStackException();
		}
			
		
		T item = top.data;
		top = top.next;
		
		return item;
			

	}
		
	// push
		
	public void push(T item) {
			
			Node<T> t = new Node<T>(item);
			t.next = top;
			top = t;
	}
		
	// peek
		
	public T peek() {
			
		if(top == null) {
			throw new EmptyStackException();
		}
			
		return top.data;
			
	}
		
	// isEmpty
		
	public boolean isEmpty() {
			
		return top == null;
	}
	
	
	


	
}


public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		System.out.println(s.pop());
		System.out.println(s.isEmpty());
		
		
		

	}
	
	

}