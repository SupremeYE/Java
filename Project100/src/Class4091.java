import java.util.concurrent.BlockingQueue;

public class Class4091 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ī������� �����մϴ�");
		boolean isContinue = true;
		int cardA1, cardA2; //2��ī��
		int cardB1, cardB2; //2��ī��
		int sum1, sum2;//�� ���� �����ڸ� 
		int AWinCount=0, BWinCount =0;
		
		while(isContinue) {
			cardA1 = (int)(Math.random()*10)+1;
			cardA2 = (int)(Math.random()*10)+1;
			cardB1 = (int)(Math.random()*10)+1;
			cardB2 = (int)(Math.random()*10)+1;
			
			sum1 = (cardA1+cardA2)%10;//�����ڸ��� ���ϴ� ��
			sum2 = (cardB1+cardB2)%10;
			
			if(sum1>sum2) AWinCount++;
			if(sum1<sum2) BWinCount++;
			
			System.out.println("A:"+cardA1+","+cardA2+"\tB:"+cardB1+","+cardB2+"\tA:"+AWinCount+"wins,\tB:"+BWinCount+"wins");
			if((AWinCount ==10)||(BWinCount==10)) isContinue=false;
			}
		}
		
		

	}


