package practice;

public class �迭_�ִ��ּҰ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�߸����ڵ�
		/*int [] intArray = new int[10];
		int min=1,max=100;
		for(int i=1;i<=10;i++) {
			intArray[i]=(int)(Math.random()*100)+1;
			if(max<intArray[i]) {
				max=intArray[i];
			}
			else if(min>intArray[i]) {
				min=intArray[i];
			}
		
		}
		System.out.println("Min Value"+min);
		System.out.println("Max Value"+max);*/
		
		
		int numArray[]=new int[10]; //10���� Array����
		int i;
		int min=100, max=0;//�ִ� �ּҰ� �ʱ�ȭ ����
		System.out.print("Array: ");
		for (i=0;i<10;i++) {
			numArray[i]=(int)(Math.random()*100)+1;//���� �� �Ҵ�
			System.out.print(numArray[i]+",");//���
		}
		for(i=0;i<10;i++) {
			if(min>numArray[i]) min=numArray[i];//�ּҰ����� ������ min�� �Ҵ�
			if(max<numArray[i]) max=numArray[i];//�ִ񰪺��� ũ�� max�� �Ҵ�
		}
		System.out.println(" ");
		System.out.println("ū��: "+max);
		System.out.println("������: "+min);
	}

}
