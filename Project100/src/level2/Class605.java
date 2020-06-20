package level2;

public class Class605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 myCar1 = new Car3();
		Car3 myCar2 = new Car3("blue");
		Car3 myCar3 = new Car3(200);
		Car3 myCar4 = new Car3("red",250);
		
		System.out.println(myCar1.color+","+myCar1.maxSpeed);
		System.out.println(myCar2.color+","+myCar2.maxSpeed);
		System.out.println(myCar3.color+","+myCar3.maxSpeed);
		System.out.println(myCar4.color+","+myCar4.maxSpeed);
		

	}

}
