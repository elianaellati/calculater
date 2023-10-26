package application;
public class Nodee<T> {
	  private T data;
	  private Nodee <T> next;

	 public Nodee(T data){
	 this.data = data; 
	 }

	 public void setData(T data) { 
	 this.data = data; 
	 }
	 public T getData() { return data; 
	 }

	 public Nodee<T> getNext() {
		 return next;
		 }
	 public void setNext(Nodee<T> next) {
		 this.next = next;
		 }
	} 