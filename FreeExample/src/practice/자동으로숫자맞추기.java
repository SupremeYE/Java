package practice;

import java.util.Scanner;

public class �ڵ����μ��ڸ��߱� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int targetNum; //����� �ϴ� ��ǥ����
		int guessNum;//��ǻ�Ͱ� �����ϴ¼�
		int minNum=1, maxNum=100;//��������
		boolean isContinue=true;
		int tryCount=1;//������ Ƚ��
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1~100������ ���ڸ� �Է��Ͻÿ�>");
		targetNum=sc.nextInt();
		while(isContinue) {
			guessNum=(minNum+maxNum)/2; //1��100������ �߰�50���� �����ؼ� ã�¼ӵ��� ����
			if(guessNum>targetNum) {
				System.out.println(tryCount+" th try. GuessNum : "+guessNum+", TargetNum is small");
				maxNum=guessNum;
			}
			else if(guessNum<targetNum) {
				System.out.println(tryCount+" th try. GuessNum : "+guessNum+", TargetNum is big");
				minNum=guessNum;
			}
			else {
				isContinue=false;
				System.out.println("Correct");
			}
			tryCount++;
				
			
			
		}
	}

}
