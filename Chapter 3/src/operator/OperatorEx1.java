package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = -10;
		int num2 = 20;

		System.out.println(+num1);
		System.out.println(+num2);//+의 연산자는 부호유지
		

		System.out.println(-num1);
		System.out.println(-num2);//-연산자는 부호가 바뀜
		

		System.out.println(num1);
		System.out.println(num2);//변수자체 메모리에가서 바꾸지는 않는다
		
		num1 = -num1;
		System.out.println(num1);
		
	}

}
