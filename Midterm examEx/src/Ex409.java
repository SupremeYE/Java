import java.util.Scanner;

public class Ex409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("���� �ܰ� ���� ���α׷��Դϴ�");
		int selection;
		int temp;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		boolean isContinue = true;
		
		while(isContinue) {
			System.out.println("1. �Ա�  2.���  3.�ܰ�Ȯ��  4.���� ");
			System.out.print("�޴�����");
			selection=sc.nextInt();
			switch (selection) {
			case 1:
				System.out.println("���޾� �Է�>");
				temp=sc.nextInt();
				sum+=temp;
				System.out.println("����: "+temp+", ���ܰ�:"+sum);
				break;
			case 2:
				System.out.println("��ݾ� �Է�");
				temp=sc.nextInt();
				sum-=temp;
				System.out.println("���: "+temp+", ���ܰ�"+sum);
				break;
			case 3:
				System.out.println("���ܰ� :"+sum);
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�");
				isContinue=false;
				break;
			}
			
		}

	}

}
