package practice;

import java.util.Scanner;

public class �Է°���Ư�����϶����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);//�Է��Լ�
		String inputData;//�Է��� ����� ����
		boolean isContinue=true;
		
		while(isContinue) {
			System.out.print(">");
			inputData=sc.nextLine();//���ڿ��Է� 
			//���ڸ� �Է��ҽ�
			//inputData=sc.nextInt();����ϱ�
			System.out.println("input Data : "+inputData);
			//���࿡ q�� ��� ���α׷�����
			if(inputData.equals("q")) isContinue=false;
		}
		System.out.println("���α׷� ����");
	}

}
