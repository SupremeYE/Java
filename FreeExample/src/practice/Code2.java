package practice;
import java.util.Scanner;
public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("카드수 입력>");
		int totalRound;
		totalRound=sc.nextInt();
		int winA = 0, winB = 0;
		
		int matrix[][]=new int[2][3];
		
			String strWin = "";
			for(int i=0;i<=totalRound;i++) {
				
			
			//2연승 될때까지 반복
			while(winA < 2 && winB < 2) {
				for(int j=0;j<3;j++) {//가위바위보 랜덤설정
					//가위=1 바위=2 보=3(0)
					matrix[i][j]=(int)(Math.random()*3)+1;
					if(matrix[i][j]==1) System.out.print("가위\t");
					if(matrix[i][j]==2) System.out.print("바위\t");
					if(matrix[i][j]==3) System.out.print("보\t");
				}
				
				System.out.print("승자판단결과. \t");
				for(int j=0;j<10;j++) {//첫번째 사람=0 두번째 사람=1 3으로 나눴을 경우로 비교함
					//0번째는 가위or보  
					if(matrix[0][j] %3==(matrix[1][j]+1)%3) { System.out.print("1번승\t");
					winA++;}
					if(matrix[1][j] %3==(matrix[0][j]+1)%3) {System.out.print("2번승\t");
					winB++;}
					if(matrix[0][j]==matrix[1][j]) System.out.print("비김\t");
				}

				System.out.printf("A : %d , B : %d ",winA,winB);
			}
		
		
			}
		
		
		
		System.out.printf("\n최종결과 \t1번Win: %d,\t2번Win: %d,\t비김: %d",winA,winB,(10-winA-winB));

		
		

	}

}
