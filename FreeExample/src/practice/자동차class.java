package practice;

public class �ڵ���class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 mycar = new Car1();//classCar1�� ����
		System.out.println("company: "+mycar.company);
		System.out.println("model: "+mycar.model);
		System.out.println("color: "+mycar.color);
		System.out.println("max speed:"+mycar.maxSpeed);
		System.out.println("current speed: "+mycar.currentSpeed);
		
		mycar.currentSpeed=150;//������
		System.out.println("current speed: "+mycar.currentSpeed);

	}

}
