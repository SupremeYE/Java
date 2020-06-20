package level2;

import java.util.Scanner;

public class Class607 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("숫자입력>");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		Calculator2 cal = new Calculator2();
		int result;
		result=cal.calculateSum(n);
		System.out.println("계산결과: "+result);

	}

}
