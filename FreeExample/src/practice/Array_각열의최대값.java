package practice;

public class Array_�������ִ밪 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numArray=new int[10][10];//2���� �迭�Ҵ� ��������
		for(int i=0;i<10;i++) {//������
			for(int j=0;j<10;j++) {//���ο�
				numArray[i][j]=(int)(Math.random()*100)+1;//���μ��ο� ������ �Ҵ�
				System.out.print(numArray[i][j]+"\t");// ���
			}
			System.out.println(" ");//�ٹٲ�
		}
		
		int max=0;//�ִ밪 0���� �ʱ�ȭ
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(max<numArray[j][i]) max=numArray[j][i];//���� �� ��
				//i���� �տ� ������ �ึ�� ���� �񱳵�
			}
			System.out.println((i+1)+"��° �� �ִ밪 : "+max);
			max=0;//�ٽ� �ִ밪�� �ʱ�ȭ�ؼ� ������ ���ο� �ִ밪�� ���Ҽ� �ֵ��� ��
		}
		
		

	}

}
