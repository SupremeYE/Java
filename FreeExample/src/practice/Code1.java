package practice;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("����� �Է�>");
		int classScore = sc.nextInt();
		
		int Astudent[] = new int[classScore];
		int Bstudent[] = new int[classScore];
		int Cstudent[] = new int[classScore];
		
		for(int i=0;i<classScore;i++) {
			Astudent[i]=(int)(Math.random()*100);
			Bstudent[i]=(int)(Math.random()*100);
			
		}
		System.out.print("�л�A ���� : ");
		for(int i=0;i<classScore;i++) {
			System.out.print(Astudent[i]+"\t");
		}
		System.out.print("\n�л�B ���� : ");
		for(int i=0;i<classScore;i++) {
			System.out.print(Bstudent[i]+"\t");
		}
		System.out.print("\n�л�C ���� : ");
		for(int i=0;i<classScore;i++) {
			int avg;
			avg=(Astudent[i]+Bstudent[i])/2;
			Cstudent[i]=avg;
			System.out.print(Cstudent[i]+"\t");
		}
		System.out.println("\n20191216 �̿���");
		

	}

}
