
public class Ex204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value1=10;
		if(value1>5) {
			int value2;
			value2=value1+10;
			System.out.println(value2); //밖에서는 출력이 안되기때문에 메소드블록 안에서 해야함
		}
		//value2는 위 {}안에서만 사용가능하여 error발생한다
		int value2;
		//value3=value2+10; //여기서 value1으로 하면은 20이란 결과가 나온다  즉 value2는 로켤변수다
		//System.out.println(value3); 
		
	}

}
