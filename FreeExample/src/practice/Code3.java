package practice;

import java.util.Scanner;

public class Code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("����>");
		Scanner sc= new Scanner(System.in);
		int arrayLength=sc.nextInt();
		System.out.println("���ڰ���>");
		int strLength=sc.nextInt();
		int randnum;
		
		
		
		int matrix[]=new int[arrayLength];
		int i,j;
		for(i=0;i<strLength;i++) {
			System.out.print((i+1)+"��°. ");
			for(j=0;j<arrayLength;j++) {
					
				randnum=(int)(Math.random()*arrayLength);
				matrix[j]=randnum;
				System.out.print(matrix[j]);
				
			}
			System.out.println("");
			
			//20���� ������� ���ڸ����� ���ڸ� ���� ���̸鼭 ���⿡�� ���̰� �޶� ���� �ٸ��� �����°� ������
			//,(�޸�)�� ����ϸ� 20���ȿ� �������� �����ϰ� ���� ��µ˴ϴ�! 
			
		}
		System.out.println("20191216 �̿���");
		
	}

}
