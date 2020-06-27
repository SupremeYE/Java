package practice;

import java.util.Scanner;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("과목수 입력>");
		int classScore = sc.nextInt();
		
		int Astudent[] = new int[classScore];
		int Bstudent[] = new int[classScore];
		int Cstudent[] = new int[classScore];
		
		for(int i=0;i<classScore;i++) {
			Astudent[i]=(int)(Math.random()*100);
			Bstudent[i]=(int)(Math.random()*100);
			
		}
		System.out.print("학생A 점수 : ");
		for(int i=0;i<classScore;i++) {
			System.out.print(Astudent[i]+"\t");
		}
		System.out.print("\n학생B 점수 : ");
		for(int i=0;i<classScore;i++) {
			System.out.print(Bstudent[i]+"\t");
		}
		System.out.print("\n학생C 점수 : ");
		for(int i=0;i<classScore;i++) {
			int avg;
			avg=(Astudent[i]+Bstudent[i])/2;
			Cstudent[i]=avg;
			System.out.print(Cstudent[i]+"\t");
		}
		System.out.println("\n20191216 이예은");
		

	}

}
