package practice;

public class 참조객체501 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String temp1="test";
		
		String temp2;
		temp2="test";
		if(temp1==temp2) System.out.println("equals");
		
		String temp3="test";
		if(temp1==temp3) System.out.println("equals");
		
		String temp4=new String("temp");
		if (temp1!=temp4) System.out.print("equals");
		//==같다고 할 경우에는 출력이 되지 않는다

	}

}
