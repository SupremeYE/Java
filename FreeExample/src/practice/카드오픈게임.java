package practice;

import java.util.Scanner;

public class ī����°��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Awin=0, Bwin=0;//A,B�� �̱�Ƚ��
		int arrayNum;//Matrix(�迭)ũ��
		int round=0;//����Ƚ��
		int randomNum;//������ ī����ġ �Ҵ�
		boolean isContinue=true;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Matrix�� ũ�⸦ �����ϼ���>");
		arrayNum=sc.nextInt();
		
		int [][] numArray=new int[arrayNum][arrayNum];//ī�������
		char [][] numOpen=new char[arrayNum][arrayNum];//ȭ�鿡 print�Ǵ� ��
		
		//�ʱ�ī�弼��
		for(int i=0;i<arrayNum;i++) {
			for(int j=0;j<arrayNum;j++) {
				numArray[i][j]=(int)(Math.random()*100)+1;
				numOpen[i][j]='-';
			}
		}//�ϳ��� ����
		while(isContinue) {
			//���� ī����µ� ����print
			//�ѹ��� round������ ó������
			System.out.println("=========================================");
			//���� Ƚ������ �ϳ��� ���带 �� �ϼ���Ű�� �ڵ���
			System.out.println(++round+"round. A, B�� ī�带 �����մϴ�!!");
			for(int i=0;i<arrayNum;i++) {
				for(int j=0;j<arrayNum;j++) {
					System.out.print(numOpen[i][j]+"\t");//'-'�� ���
				}
				System.out.println();
			}
			//A ī�弱��
			//ī����ġ�� �����Ǹ� ���� �������� Ȯ���ϰ�, �����ϸ� ī�带 �����ϰ� �ºγ�
			int x1=0,x2=0,y1=0,y2=0;//��ǥ���� �ʿ��ϴϱ� 
			boolean numberSelect=true;//�̹� ���µ� ī��� ���õ��� �ʵ��� �ϴ� ����
			while(numberSelect) {
				randomNum=(int)(Math.random()*arrayNum*arrayNum);//10*10=0~99������ ��
				x1=randomNum/arrayNum;//A���� ������ ī�� ��ǥ(i)
				y1=randomNum%arrayNum;//A���� ������ ī�� ��ǥ(j)
				//��ǥ�� ���µǾ��ִ��� ����Ȯ��
				if((numOpen[x1][y1] !='A')&&(numOpen[x1][y1]!='B')) {
					numOpen[x1][y1]='A';
					System.out.print("A����ī��: "+"("+y1+","+x1+")");
					numberSelect=false;
				}
			}
			//B�� ī�弱��
			numberSelect=true;//�̹� ���µ� ī��� ���õ��� �ʵ��� �ϴ� ����
			while(numberSelect) {
				randomNum=(int)(Math.random()*arrayNum*arrayNum);//10*10=0~99������ ��
				x2=randomNum/arrayNum;//B���� ������ ī�� ��ǥ(i)
				y2=randomNum%arrayNum;//B���� ������ ī�� ��ǥ(j)
				//��ǥ�� ���µǾ��ִ��� ����Ȯ��
				if((numOpen[x2][y2] !='A')&&(numOpen[x2][y2]!='B')) {
					numOpen[x2][y2]='B';
					System.out.print(", B����ī��: "+"("+y2+","+x2+")");
					numberSelect=false;
				}
			}
			//A,B�� ī��Ȯ�ι� ����Ȯ��
			if(numArray[x1][y1]>numArray[x2][y2]) Awin++;
			if(numArray[x1][y1]<numArray[x2][y2]) Bwin++;
			System.out.println("Aī�� ����: "+numArray[x1][y1]+"Bī�����: "+numArray[x2][y2]);
			System.out.println("A�̱�Ƚ��: "+Awin+"B�̱�Ƚ��: "+Bwin);
			
			if(Awin==5) {
				isContinue=false;
				System.out.println("A���� �¸�!!!");
			}
			if(Bwin==5) {
				isContinue=false;
				System.out.println("B���� �¸�!!!");
			}
			
			
		}
		
	}

}
