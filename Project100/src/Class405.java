
public class Class405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("�ֻ��� 3�� ���ڰ� ��� ��ġ�Ҷ����� �����ϴ�");
		int dice1, dice2, dice3;
		int num=1;
		boolean isContinue = true;
		
		while(isContinue) {
			dice1 = (int)(Math.random()*6)+1; //�ֻ��� 1-6
			dice2 = (int)(Math.random()*6)+1;
			dice3 = (int)(Math.random()*6)+1;
			
			System.out.println(num + "th\t dice1:"+ dice1+"\t dice2:"+dice2+"\t dice3:"+dice3);
			if((dice1==dice2) && (dice2==dice3)) {//AND�������� �Ѵ� TURE���� �� ������
				isContinue=false; //������ Ż��
			}
				
			num++; //�����ϴ� Ƚ�� ����
			
			
		}
		System.out.println("���α׷��� �����մϴ�");
		

	}

}
