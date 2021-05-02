
public class LL_AS_A_STACK_CLIENT {
	public static void main(String args[]) throws Exception {
		LL_AS_A_STACK stack=new LL_AS_A_STACK();
		stack.push(10);
		stack.display();
		stack.push(20);
		stack.display();
		stack.push(30);
		stack.display();
		stack.push(40);
		stack.display();
		stack.push(50);
		stack.display();
		System.out.println(stack.pop());
		stack.display();
		
	}

}
