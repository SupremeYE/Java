package practice;

import java.util.Scanner;

public class �����Ѽ��ڸ��߱���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int targetNum=(int)(Math.random()*100)+1; //�����ϰ� ������ ���ڸ� ����(�������)
		int inputNum;//�Է��Ҽ� 
		Scanner sc=new Scanner(System.in);
		System.out.println("1~100������ ���ڸ� ���纸����");
		boolean isContinue= true;
		while(isContinue) {
			System.out.print("���ڸ� �Է��ϼ���>");
			inputNum=sc.nextInt();
			if(targetNum>inputNum) {
				System.out.println("�Է��� ���ں��� Ů�ϴ�");
			}
			else if(targetNum<inputNum) {
				System.out.println("�Է��� ���ں��� �۽��ϴ�");
			}
			else
				isContinue=false;
		}
		System.out.println("���α׷�����");

	}

}
