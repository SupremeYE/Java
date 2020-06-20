import java.util.Scanner;

public class Ex509_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String[] strArray = new String[2];
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println(" 학생 3명의 이름을 입력하세요");
		for(i=0;i<2;i++) {
			System.out.print(">");
			strArray[i]=scanner.nextLine();
			
		}
		
		int studentA[]=new int[7];
		int studentB[] = new int[7];
		int studentC[]=new int[7];
		
		int j;
		for(j=0;j<7;j++) {
			studentA[j]=(int)(Math.random()*100)+1;
			studentB[j] = (int)(Math.random()*100)+1;
			if(studentA[j]>=studentB[j]) studentC[j]=studentA[j];
			if(studentA[j]<studentB[j]) studentC[j]=studentB[j];
		}
		

		
		System.out.println("=================================");
		for(i=0;i<2;i++) {
			System.out.println((i+1)+"번째: "+strArray[i]);
		}
		
				
		
		System.out.println("=================================");
		
		
		
		
		

	}
}
