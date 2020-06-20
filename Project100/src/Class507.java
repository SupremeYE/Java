import java.util.Scanner;

public class Class507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생수 입력>");
		int studentNum;
		studentNum = scanner.nextInt();
		

		int numArray[] = new int[studentNum];
		int i;
		
		System.out.print("Array : ");
		
		for(i=0;i<studentNum;i++) {
			numArray[i] = (int)(Math.random()*100)+1;
			System.out.print(numArray[i]+",");
			
		}
		int min=100;
		int max=1;
		int sum=0;
		
		for(i=0;i<studentNum;i++) {
			if(numArray[i]<min) min=numArray[i];
			if(numArray[i]>max) max=numArray[i];
			sum+=numArray[i];
		}
		System.out.println("\n min : "+min);
		System.out.println("max : "+max);
		System.out.println("average : "+sum/studentNum);

	}

}
