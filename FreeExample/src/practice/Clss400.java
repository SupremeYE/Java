package practice;

public class Clss400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; //�ֻ����� ���ں���
		boolean isContinue=true; //�ݺ����� ���� ���Ǽ���
		
		while(isContinue) {
			num=(int)(Math.random()*6)+1; //�ֻ����� ���� �����ϰ� �����Ը���
			System.out.println("random dice is "+num);
			if(num==3) {//3�ϰ�� Ư���������
				System.out.println("���α׷�����");
				isContinue=false;//����
			}
			
		}
		
		
		
	}

}
