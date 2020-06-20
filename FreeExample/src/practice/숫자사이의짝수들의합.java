package practice;

import java.util.Scanner;

public class 숫자사이의짝수들의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("입력한 숫자까지의 짝수합을 계산합니다");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%2==0) sum+=i;
			System.out.println("현재 i값: "+i+", 현재합"+sum);
		}
		System.out.println(sum);
		

	}

}
