package practice;

import java.util.Scanner;

public class 자동으로숫자맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int targetNum; //맞춰야 하는 목표숫자
		int guessNum;//컴퓨터가 추축하는수
		int minNum=1, maxNum=100;//범위지정
		boolean isContinue=true;
		int tryCount=1;//진행한 횟수
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1~100사이의 숫자를 입력하시오>");
		targetNum=sc.nextInt();
		while(isContinue) {
			guessNum=(minNum+maxNum)/2; //1과100사이의 중간50부터 시작해서 찾는속도를 높임
			if(guessNum>targetNum) {
				System.out.println(tryCount+" th try. GuessNum : "+guessNum+", TargetNum is small");
				maxNum=guessNum;
			}
			else if(guessNum<targetNum) {
				System.out.println(tryCount+" th try. GuessNum : "+guessNum+", TargetNum is big");
				minNum=guessNum;
			}
			else {
				isContinue=false;
				System.out.println("Correct");
			}
			tryCount++;
				
			
			
		}
	}

}
