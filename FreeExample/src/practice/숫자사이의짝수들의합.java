package practice;

import java.util.Scanner;

public class ���ڻ�����¦�������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.print("�Է��� ���ڱ����� ¦������ ����մϴ�");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(i%2==0) sum+=i;
			System.out.println("���� i��: "+i+", ������"+sum);
		}
		System.out.println(sum);
		

	}

}
