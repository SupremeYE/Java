import java.util.Scanner;

public class Ex403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("q를 입력하면 프로그램이 종료됩니다");
		Scanner sc = new Scanner(System.in);//데이터 타입의 스캐너
		String inputData;
		boolean isContinue = true;
		while(isContinue) {
			System.out.print(">");
			inputData=sc.nextLine();
			System.out.println("input data : "+inputData);
			
			if(inputData.equals("q")) isContinue=false;
			
			
		}
		System.out.println("프로그램 종료");
	}//String 문자열 버전

}
