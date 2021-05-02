

public class BSTCLient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] in= {10,20,30,40,50,60,70};
BST bst=new BST(in);
bst.display();
System.out.println(bst.find(70));
bst.add(55);
bst.display();
bst.remove(55);
bst.display();
	}

}
