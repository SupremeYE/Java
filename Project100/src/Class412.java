import java.util.Scanner;

public class Class412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isContinue = true;
		Scanner scanner = new Scanner(System.in);
		int choice; //�޴�����
		int speed=0; //����ӵ�
		int time = 0; //�Ѱ���ð�
		int distance = 0; //���̵��Ÿ�
		
		while(isContinue) {
			System.out.println("1. �ӵ�����  2.�ӵ����� 3. 1�ð�(1turn)���  4. �̵��Ÿ� 5. ����");
			System.out.println("�޴�����");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				speed+=10;
				System.out.println("����ӵ�:"+speed+"km/h\n");
				break;
			case 2:
				speed-=10;
				System.out.println("����ӵ�:"+speed+"km/h\n");
				break;
			case 3:
				distance+=speed;
				time++;
				System.out.println("�� �ҿ�ð�: "+time+"����ӵ�:"+speed+"�� �̵��Ÿ�:"+distance+'\n');
				break;
			case 4:
				System.out.println("��  �̵��Ÿ�:"+distance);
				break;
			case 5:
				isContinue = false;
				System.out.println("��սü�:"+distance/time);
				System.out.println("�����մϴ�");
				break;
				
			}
		}

	}

}
