package level2;

public class Class603 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car1 myCar = new Car1();
		System.out.println("company: "+myCar.company);
		System.out.println("model: "+myCar.model);
		System.out.println("current speed:"+myCar.currentSpeed);
		
		myCar.currentSpeed=150; //정수변수 값 변환시
		System.out.println("current speed:"+myCar.currentSpeed);

		
	}

}
