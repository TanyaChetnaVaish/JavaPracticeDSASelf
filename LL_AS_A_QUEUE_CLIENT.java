

public class LL_AS_A_QUEUE_CLIENT {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
LL_AS_A_QUEUE queue=new LL_AS_A_QUEUE();
queue.enqueue(10);
queue.display();
queue.enqueue(20);
queue.display();
queue.enqueue(30);
queue.display();
queue.enqueue(40);
queue.display();
queue.enqueue(50);
queue.display();
System.out.println(queue.dequeue());
queue.display();


	}

}
