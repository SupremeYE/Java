import java.util.Scanner;

public class Ex510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String inputData;
		boolean isContinue=true;
		System.out.println("q가 나올때까지 입력을 받습니다");
		while (isContinue) {
			System.out.print(">");
			inputData=sc.next();
			
			if(inputData.equals("q")) isContinue=false; 
		}
		System.out.println("프로그램을 종료합니다");
	}

}
