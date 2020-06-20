package practice;

public class Class204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수는 선언된 블록 내에서만 사용이 가능하다.
		int value1=10;
		if(value1>5) {
			int value2;
			value2=value1+10;
			System.out.println(value2);
		}
		
		//value2는 {}안에서만 사용이 가능하기 떄문에 에러가 발생한다
		int value3;
		//value3=value2+10;
		//System.out.println(value3);

	}

}
