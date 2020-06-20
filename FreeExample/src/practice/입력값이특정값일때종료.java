package practice;

import java.util.Scanner;

public class 입력값이특정값일때종료 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);//입력함수
		String inputData;//입력이 저장될 변수
		boolean isContinue=true;
		
		while(isContinue) {
			System.out.print(">");
			inputData=sc.nextLine();//문자열입력 
			//숫자를 입력할시
			//inputData=sc.nextInt();사용하기
			System.out.println("input Data : "+inputData);
			//만약에 q일 경우 프로그램종료
			if(inputData.equals("q")) isContinue=false;
		}
		System.out.println("프로그램 종료");
	}

}
