package practice;

import java.util.Scanner;

public class 중간고사2차시험1번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("20191216 이예은\n");
		Scanner sc = new Scanner(System.in);
		String matrix[] = {"홈런", "안타", "안타", "아웃", "아웃", "아웃", "아웃", "아웃", "아웃", "아웃"};  
		int player[][];
		
		System.out.print("player 수>");
		int p = sc.nextInt();
		player = new int[p][2];	// [i][0] : 안타, [i][1] : 홈런 
		
		System.out.print("타격횟수>");
		int Hit_count = sc.nextInt();
		
		
		
		System.out.println("===========================");
		System.out.println("*** 타자기록 ***");
		for(int i = 0; i < p; i++)
		{
			System.out.print((i+1)+"번째 타자 :");
			for(int j = 0; j < Hit_count; j++)
			{
				int k = (int)(Math.random() * 10);
				System.out.print("\t"+matrix[k]);
				if(matrix[k] == "안타")
					player[i][0]++;
				else if(matrix[k] == "홈런")
					player[i][1]++;
				
			}
			System.out.println("");
		}
		
		System.out.println("===========================");
		
		System.out.println("*** 타자별 기록 ***");
		for(int i = 0; i < p; i++)
		{
			System.out.print((i+1)+"번째 타자 : ");
			System.out.println(Hit_count+" 타수 "+player[i][0]+" 안타. " + player[i][1]+" 홈런!!!");
			
		}
	}

}
