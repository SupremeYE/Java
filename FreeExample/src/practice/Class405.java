package practice;

public class Class405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dice1,dice2,dice3; //��������
		boolean isContinue=true;
		int num=1; //Ƚ������
		
		while(isContinue) {
			dice1=(int)(Math.random()*6)+1; //������ �� �Ҵ�
			dice2=(int)(Math.random()*6)+1;
			dice3=(int)(Math.random()*6)+1;
			
			System.out.println(num+"th\t"+"dice1:"+dice1+"\tdice2:"+dice2+"\tdice3:"+dice3);
			
			if((dice1==dice2) && (dice2==dice3)) isContinue=false; //3���� �ֻ����� ���� ���
			num++; //Ƚ������
			
		}
		System.out.println("���α׷��� �����մϴ�");

	}

}
