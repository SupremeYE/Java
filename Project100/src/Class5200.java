import java.util.Scanner;

public class Class5200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int AWinCount =0, BWinCount=0;
		int arrayNum;
		int round =0;
		int randomNum;
		boolean isContinue = true;
		Scanner sc=new Scanner(System.in);
		System.out.print("Matrix ũ��>");
		arrayNum=sc.nextInt();
		
		int[][] numArray = new int [arrayNum][arrayNum];
		char [][] numOpen = new char[arrayNum][arrayNum];
		
		//matrix�ʱ�ȭ
		for (int i=0;i<arrayNum;i++) {
			for(int j=0;j<arrayNum;j++) {
				numArray[i][j] = (int)(Math.random()*100)+1;
				numOpen[i][j]='-';
			}
		}
		while(isContinue) {
			//�Ѻ��� round������ ó������
			System.out.println("===========================");
			System.out.println(++round+"round. A, B�� ī�带 �����մϴ�");
			for(int i=0;i<arrayNum;i++) {
				for(int j=0;j<arrayNum;j++) {
					System.out.print(numOpen[i][j]+"\t");
				}
				System.out.println();
			}
			//A, B �� ī�弱��...
			int x1=0,x2=0,y1=0,y2=0;
			boolean numberSelect = true;
			while (numberSelect) {
				randomNum=(int)(Math.random()*arrayNum*arrayNum);
				x1=randomNum/arrayNum; //A���� ������ ī�� ��ǥ(i)
				y1=randomNum%arrayNum; //A���� ������ ī�� ��ǥ(j)
				//��ǥ�� open�Ǿ����� ����Ȯ��
				if((numOpen[x1][y1] !='A')&&(numOpen[x1][y1]!='B')) {
					numOpen[x1][y1]='A'; 
					System.out.print("A����ī�� : ("+x1+","+y1+"),");
					numberSelect = false;
				}
			}
			numberSelect=true;
			while(numberSelect) {
				randomNum=(int)(Math.random()*arrayNum*arrayNum);
				x2=randomNum/arrayNum; //B���� ������ ī�� ��ǥ(i)
				y2=randomNum%arrayNum; //B���� ������ ī�� ��ǥ(i)
				//��ǥ�� open�Ǿ����� ����Ȯ��
				if((numOpen[x2][y2] !='A')&&(numOpen[x1][y1]!='B')) {
					numOpen[x2][y2]='B'; System.out.print("B����ī�� ��ġ: ("+x2+","+y2+"),");
					numberSelect = false;
					
			}
		}
			//A�� B�� ī��Ȯ�� �� ���б��
			if (numArray[x1][y1]>numArray[x2][y2]) AWinCount++;
			if (numArray[x1][y1]<numArray[x2][y2]) BWinCount++;
			System.out.println("Aī����� : "+numArray[x1][y1]+", Bī�����: "+numArray[x2][y2]);
			
			System.out.println("A�̱�Ƚ��: "+AWinCount+", B�̱�Ƚ��: "+BWinCount);
			if(AWinCount==5) {
				isContinue=false;
				System.out.println("A�� �¸�");
			}
			if(BWinCount==5) {
				isContinue=false;
				System.out.println("B�� �¸�");
			}
			
		
	}

	}
}
