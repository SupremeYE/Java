
public class Ex217 {//타입변환

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int를 byte로 변환(큰타입=>작은타입, type casting 필요)
		int intValue =10;
		byte byteValue;
		byteValue=(byte)intValue;
		System.out.println(byteValue);
		//int를 char로 변환(큰타입=>작은타입, type casting필요)
		intValue=65;
		char charValue;
		charValue=(char)intValue;
		System.out.println(charValue);

	}

}
