package practice;

public class Array_���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numArray=new int[2][10];//2*10�迭 �Ҵ�
		int Awin=0,Bwin=0;//���� �� ���� �ʱ�ȭ����
		for(int i=0;i<2;i++) {//����� ���
			System.out.print((i+1)+"��° ���. \t");
			for(int j=0;j<10;j++) {//���������� ��������
				//����=1 ����=2 ��=3(0)
				numArray[i][j]=(int)(Math.random()*3)+1;
				if(numArray[i][j]==1) System.out.print("����\t");
				if(numArray[i][j]==2) System.out.print("����\t");
				if(numArray[i][j]==3) System.out.print("��\t");
			}
			System.out.println();
		}
		System.out.print("�����Ǵܰ��. \t");
		for(int j=0;j<10;j++) {//ù��° ���=0 �ι�° ���=1 3���� ������ ���� ����
			//0��°�� ����or��  
			if(numArray[0][j] %3==(numArray[1][j]+1)%3) { System.out.print("1����\t");
			Awin++;}
			if(numArray[1][j] %3==(numArray[0][j]+1)%3) {System.out.print("2����\t");
			Bwin++;}
			if(numArray[0][j]==numArray[1][j]) System.out.print("���\t");
		}
		
		System.out.printf("\n������� \t1��Win: %d,\t2��Win: %d,\t���: %d",Awin,Bwin,(10-Awin-Bwin));

	}

}
