



public class LinkedListGeneric<T> {
	private class Node{
		T data;
		Node next;
	}
	private Node head;
    private Node tail;
    private int size;
    public void display() {
    	Node temp=this.head;
    	while(temp!=null) {
    		System.out.println(temp.data);
    		temp=temp.next;
    	}
    }
    //O(1)
    public void addLast(T item) {
    	Node nn=new Node();
    	nn.data=item;
    	nn.next=null;
    	if(this.size>=1) {
    		this.tail.next=nn;
    		
    	}
    	if(this.size==0) {
    		this.head=nn;
    		this.tail=nn;
    		this.size++;
    	}
    	else {
    		this.tail=nn;
    		size++;
    	}
    	
    }
    //O(1)
    public void addFirst(T item) {
    	Node nn=new Node();
    	nn.data=item;
    	nn.next=null;
    	if(this.size>=1) {
    		nn.next=this.head;
    	}
    	if(this.size==0) {
    		this.head=nn;
    		this.tail=nn;
    		this.size++;
    	}
    	else {
    		this.head=nn;
    		this.size++;
    	}
    }
    public T getFirst() throws Exception {
    	if(this.size==0) {
    		throw new Exception("LL is Empty");
    	}
    	else {
    		return this.head.data;
    	}
    }
    public T getLast() throws Exception {
    	if(this.size==0) {
    		throw new Exception("LL is Empty");
    	}
    	else {
    		return this.tail.data;
    	}
    }
    public T getAt(int pos) throws Exception {
    	if(this.size==0) {
    		throw new Exception("LL is Empty");
    	}
    	if(pos<0||pos>=this.size) {
    		throw new Exception("Index Not Found");
    	}
    	else {
    		
    			int i=1;
    			Node temp=this.head;
    			while(i<=pos) {
    				temp=temp.next;
    				i++;
    				
    			}
    			return temp.data;
    			
    		}
    	}
    //o(n)
    public Node getNodeAt(int pos) throws Exception {
    	if(this.size==0) {
    		throw new Exception("LL is Empty");
    	}
    	if(pos<0||pos>=this.size) {
    		throw new Exception("Index Not Found");
    	}
    	else {
    		
    			int i=1;
    			Node temp=this.head;
    			while(i<=pos) {
    				temp=temp.next;
    				i++;
    				
    			}
    			return temp;
    			
    		}
    	
    }
    //O(n)
    public void addAt(T item,int pos) throws Exception {
    	
    	if(pos<0||pos>=this.size) {
    		throw new Exception("Index Not Found");
    	}Node nn=new Node();
    	nn.data=item;
    	nn.next=null;
    	if(pos==1) {
    		addFirst(item);
    	}
    	if(pos==this.size) {
    		addLast(item); 
    	}
    	else {
    		Node nn1=getNodeAt(pos-1);
    		Node np1=nn1.next;
    		nn1.next=nn;
    		nn.next=np1;
    		this.size++;
    		
    	}
    }
    //O(1)
    public T removeFirst() throws Exception {
    	if(this.size==0) {
    		throw new Exception("LL is Empty");
    	}
    	T n=this.head.data;
    	if(this.size==1) {
    		
    		this.head=null;
    		this.tail=null;
    		this.size=0;
    		
    		
    		
    		
    	}
    	else {
    		this.head=this.head.next;
    		this.size--;
    	}
    	return n;
    }
    //O(n)
    public T removelast() throws Exception{
    	if(this.size==0) {
    		throw new Exception("LL is Empty");
    	}
    	T n=this.tail.data;
if(this.size==1) {
    		
    		this.head=null;
    		this.tail=null;
    		this.size=0;
    		
    		
    		
    		
    	}else {
    		//Node nn=this.head;
    		//while(nn.next.next!=null) {
    			//nn=nn.next;
    		//}
    		Node nn=getNodeAt(this.size-2);
    		this.tail=nn;
    		this.tail.next=null;
    		this.size--;
    	}
return n;
    }
    public T removeAt(int pos) throws Exception {
    	
    	if(this.size==0) {
    		throw new Exception("LL is Empty");
    	}
    	if(pos<0||pos>=this.size) {
    		throw new Exception("Index Not Found");
    	}
    	if(pos==0) {
    		return removeFirst();
    	}
    	else if(pos==this.size-1) {
    		return removelast();
    	}
    	else {
    		Node nm1=getNodeAt(pos-1);
    		Node n=nm1.next;
    		Node np1=n.next;
    		nm1.next=np1;
    		this.size--;
    		return n.data;
    	}
    	
    	
    }
   
    public int size() {
    	return this.size;

}
}
