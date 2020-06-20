package practice;

import java.util.Scanner;

public class 랜덤한숫자맞추기게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetNum=(int)(Math.random()*100)+1; //랜덤하게 정해진 숫자를 지정(맟출숫자)
		int inputNum;//입력할수 
		Scanner sc=new Scanner(System.in);
		System.out.println("1~100사이의 숫자를 맞춰보세요");
		boolean isContinue= true;
		while(isContinue) {
			System.out.print("숫자를 입력하세요>");
			inputNum=sc.nextInt();
			if(targetNum>inputNum) {
				System.out.println("입력한 숫자보다 큽니다");
			}
			else if(targetNum<inputNum) {
				System.out.println("입력한 숫자보다 작습니다");
			}
			else
				isContinue=false;
		}
		System.out.println("프로그램종료");

	}

}
