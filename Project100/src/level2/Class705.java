package level2;

public class Class705 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent parent = new Parent();
		Child1 c1  = new Child1();
		Child2 c2  = new Child2();
		
		parent.printName();
		
		parent=c1;
		parent.printName();
		

		parent=c2;
		parent.printName();
		
	}

}
