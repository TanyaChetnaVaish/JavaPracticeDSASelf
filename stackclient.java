
public class stackclient {
	public static void main(String args[]) throws Exception{
		stack st=new stack(5);
		for(int i=1;i<=5;i++) {
			st.push(i*10);
			st.display();
		}
		System.out.println(st.top());
		while(!st.isEmpty()) {
			st.display();
			st.pop();
		}
		
	}

}
