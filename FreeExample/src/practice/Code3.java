package practice;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("길이>");
		Scanner sc= new Scanner(System.in);
		int arrayLength=sc.nextInt();
		System.out.println("숫자개수>");
		int strLength=sc.nextInt();
		int randnum;
		
		
		
		int matrix[]=new int[arrayLength];
		int i,j;
		for(i=0;i<strLength;i++) {
			System.out.print((i+1)+"번째. ");
			for(j=0;j<arrayLength;j++) {
					
				randnum=(int)(Math.random()*arrayLength);
				matrix[j]=randnum;
				System.out.print(matrix[j]);
				
			}
			System.out.println("");
			
			//20으로 했을경우 한자리수와 두자리 수가 섞이면서 보기에는 길이가 달라서 수가 다르게 나오는거 같지만
			//,(콤마)를 사용하면 20개안에 범위에서 랜덤하게 수가 출력됩니다! 
			
		}
		System.out.println("20191216 이예은");
		
	}

}
