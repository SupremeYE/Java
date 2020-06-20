package variable;

public class ExpicitConverSion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int i= 1000;
		byte bNum = i;*/ //4바이트를 1바이트에 할당하는것은 오류
		
		int i= 1000;
		byte bNum =(byte)i; //명시적 형변환을 사용해야함 단, 데이터유실이 생길수있다.
		//byte는 -128~127까지 가능한데 1000은 넘었음
		System.out.println(bNum);
		
		double dNum1 = 1.2;
		float fNum = 0.9f;
		
		int iNum1 =(int)dNum1 +(int)fNum;
		int iNum2 =(int)(dNum1 +fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		

	}

}
