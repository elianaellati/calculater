package application;

public class LinkedList <T > {
    Nodee <T> head;
	 Nodee <T>m;
	
	public void insert (T data){
		Nodee <T> m= new Nodee(data);
		Nodee <T> curr=head;
		Nodee  <T> prev=null;
		
		if(head==null) {
			
			head=m;
		}else {
			while((curr.getNext()!=null)) {
				
				curr=curr.getNext();
				
			}
			
		curr.setNext(m);
	   m.setNext(null);
	
		}

}
}