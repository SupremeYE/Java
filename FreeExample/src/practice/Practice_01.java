package practice;

public class Practice_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while���� �̿��ؼ� �ֻ�����ȣ �� �ϳ��� �ݺ������� �̵� 6�� ������ ���α׷��� �����Ų��.
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("���α׷� ����");

	}

}
