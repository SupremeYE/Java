package variable;

public class IntagerTest {
	
	public static void main(String[] args) {
		
		byte bs = -127;
		System.out.println(bs);
		System.out.println(Byte.SIZE);//Byte가 몇 비트인지 확인할수있다.
		
		//byte= bs2 = 127;
		//System.out.println(bs2);
		
		
		int iVal = 1234567890;//10자리까지 가능
		System.out.println(iVal);
		
		long lVal = 1234567890000000000l;
		System.out.println(lVal);//숫자자체를 4바이트로 둠 자바는 기본적으로 숫자를 정수형에 넣음
		
		long OVal = 10000000000l;
		System.out.println(OVal);
	}

}
