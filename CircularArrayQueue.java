

public class CircularArrayQueue {
	private int arr[];
	private int cs;
	private int ms;
	private int front;
	private int rear;
	public static int Default_capacity=10;
CircularArrayQueue(){
	this(Default_capacity);
	
}
CircularArrayQueue(int capacity){
	this.arr=new int[capacity];
	this.cs=0;
	this.ms=capacity;
	this.front=0;
	this.rear=capacity-1;
}
public boolean isfull() {
	return this.cs==this.ms;
	
}
public boolean isEmpty() {
	return this.cs==0;
}
public void enqueue(int data) {
	if(!this.isfull()) {
		this.rear=(this.rear+1)%this.arr.length;
		this.arr[this.rear]=data;
		this.cs=this.cs+1;
	}
}
public void dequeue() {
	if(!this.isEmpty()) {
		this.front=(this.front+1)%this.arr.length;
		this.cs=this.cs-1;
	}
}
public int getFront() {
	return this.arr[this.front];
}

}
