package Practice;
public class CircularArrayqueueClient {
public static void main(String args[]) {
	CircularArrayQueue queue=new CircularArrayQueue();
	for(int i=1;i<=6;i++) {
		queue.enqueue(i);
	}
	queue.dequeue();
	queue.dequeue();
	queue.enqueue(8);
	while(!queue.isEmpty()) {
		System.out.println(queue.getFront());
		queue.dequeue();
	}
}
	
}
