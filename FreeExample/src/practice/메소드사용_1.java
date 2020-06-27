package practice;

import java.util.Scanner;

public class 메소드사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number,range;
		System.out.println("random 범위와 random 개수를 입력하세요");
		
		System.out.print("radom 범위");
		range=sc.nextInt();
		System.out.print("random 개수>>");
		
		number=sc.nextInt();
		
		Calcul3 cal=new Calcul3();
		
		cal.numberGernerate(number,range);
							//개수     //범위

	}

}
