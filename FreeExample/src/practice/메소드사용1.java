package practice;

import java.util.Scanner;

public class �޼ҵ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�����Է�>");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		Calcul cal = new Calcul();
		int result;
		result=cal.cal2(n);
		System.out.println(result);
		
	}

}
