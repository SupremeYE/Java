package practice;

public class ī����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2���� ���� ���� 2���� ī�带 �ް�(1~10����) �μ��� ���� �����ڸ��� ū ���� �¸�
		//��� ������ 10���� �̱�� ������ �����
		int cardA1, cardA2;
		int cardB1, cardB2;
		boolean isContinue=true;
		int teamAwin=0,teamBwin=0;
		int sum1,sum2;
		
		while(isContinue) {
			cardA1=(int)(Math.random()*10)+1;
			cardA2=(int)(Math.random()*10)+1;
			cardB1=(int)(Math.random()*10)+1;
			cardB2=(int)(Math.random()*10)+1;
			//���� �����ڸ���
			sum1=(cardA1+cardA2)%10;
			sum2=(cardB1+cardB2)%10;
			
			if(sum1>sum2) teamAwin++;
			if(sum1<sum2) teamBwin++;
			
			
			System.out.println("A:"+cardA1+","+cardA2+"\tB:"+cardB1+","+cardB2+"\tA: "+teamAwin+", B:"+teamBwin);
			
			if((teamAwin==10) ||(teamBwin==10)) isContinue=false;
		}
		
	}

}
