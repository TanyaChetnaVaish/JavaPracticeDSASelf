

public class DynamicStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		stack st=new DynamicStack(5);
		for(int i=1;i<=5;i++) {
			st.push(i*10);
			st.display();
		}
		st.push(60);
		System.out.println(st.top());
		while(!st.isEmpty()) {
			st.display();
			st.pop();
		}
	}

}
