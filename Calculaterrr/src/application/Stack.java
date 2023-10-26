package application;

public interface Stack <T> {
	void push(T data);
	T pop();
	T peek();
	boolean isEmpty();
	void clear();
	
}

