package practice;

public class 자동차class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 mycar = new Car1();//classCar1에 접근
		System.out.println("company: "+mycar.company);
		System.out.println("model: "+mycar.model);
		System.out.println("color: "+mycar.color);
		System.out.println("max speed:"+mycar.maxSpeed);
		System.out.println("current speed: "+mycar.currentSpeed);
		
		mycar.currentSpeed=150;//값변경
		System.out.println("current speed: "+mycar.currentSpeed);

	}

}
