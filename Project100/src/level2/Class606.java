package level2;

public class Class606 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator1 cal = new Calculator1();
		int result;
		
		cal.calOn();
		
		result = cal.add(15,5);
		System.out.println(result);
		
		result = cal.sub(15,5);
		System.out.println(result);
		
		result = cal.mul(15,5);
		System.out.println(result);
		
		result = cal.div(15,5);
		System.out.println(result);
		cal.calOff();
		

	}

}
