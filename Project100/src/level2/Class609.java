package level2;

import java.util.Scanner;

public class Class609 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int range, number;
		System.out.println("개수입력>");
		System.out.print("random범위");
		range=sc.nextInt();
		System.out.print("random개수");
		number=sc.nextInt();
		
		Calculator3 myCall= new Calculator3();
		myCall.numberGenerate(number, range);
	}

}
