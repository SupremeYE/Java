package practice;
import java.util.Scanner;

public class 중간고사1차시험2번 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int finalWinA = 0, finalWinB = 0;//최종 승 횟수 카운트
		//3라운드 반복
		for(int i=1; i<=3; i++) {

			//각각 승 횟수 카운트
			int winA = 0, winB = 0;
			String strWin = "";
			
			//2연승 될때까지 반복
			while(winA < 2 && winB < 2) {
				int a = (int)(Math.random()*5)+1;
				int b = (int)(Math.random()*5)+1;

				if(a>b) {
					winA++;
					strWin = "A Win";
				}else if(a < b) {
					winB++;
					strWin = "B Win";
				}else {
					strWin = "DRAW";
				}

				System.out.printf("A : %d , B : %d , Result : %s %n",a,b,strWin);
			}
			if(winA == 2) {
				strWin = "A Win!!!!";
				finalWinA++;
			}else {
				strWin = "B Win!!!!";
				finalWinB++;
			}
			System.out.printf("%dth round. %s%n",i,strWin);
		}
		System.out.printf("Final result. A : %d , B : %d%n",finalWinA, finalWinB);
	}

}