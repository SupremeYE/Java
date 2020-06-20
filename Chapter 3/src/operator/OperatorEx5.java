package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2);//둘라 1이 비트가 없음
		System.out.println(num1 | num2); 
		System.out.println(num1 ^ num2); 
		

		System.out.println(num2<<1); 
		System.out.println(num2<<2); //5*2에 2승
		System.out.println(num2<<3); //5*2에3승
		System.out.println(num2); //값이 변하지는 않음 변하게하려면 대입연산자ㅡㄹ 사용해야함
		//System.out.println(num2<<=3);
		
		System.out.println(num2>>2);// 5/2에2승 즉, 몫값이 결과
		System.out.println(num2>>1);// 5/2에1승
		
		
	}

}
