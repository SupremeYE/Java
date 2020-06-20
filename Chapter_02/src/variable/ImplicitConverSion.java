package variable;

public class ImplicitConverSion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bNum = 10;//1바이트의 값이고
		int iNum = bNum;//int는 4바이트 값이기 때문에 1바이트값이 들어와도 괜찮음
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20; //덜 정밀한수
		float fNum = iNum2;//fNum은 더 정밀한 수
		
		//실수가 더 정밀한 수이고 표현범위가 훨씬 넓음 그래서 모든 정수가 실수로 형변환 될때 아무런 문제가없음
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;//여기서는 2번의 형변환이 일어남 정수->float/ float의 결과가 double로 바뀜
		System.out.println(dNum);
	}

}
