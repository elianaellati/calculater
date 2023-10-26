package application;

public class CursorStack <T extends Comparable<T>> implements Stack<T>{
	CursorArray<T> stack = new CursorArray(1000);
	int list = stack.createList();
	LinkedList d=new LinkedList();
	@Override
	public void push(T data) {
		if(!stack.insertAtHead(data, list))
			System.out.println("Error Satck Overflow!!!!");
	}

	@Override
	public T pop() {
		return (T)stack.deleteFirst(list);
	}

	@Override
	public T peek() {
		return (T)stack.getFirst(list);
	}

	@Override
	public boolean isEmpty() {
		return stack.isEmpty(list);
	}

	@Override
	public void clear() {
		d.head=null;
		//d.head.setNext(null);
	}
	

}
