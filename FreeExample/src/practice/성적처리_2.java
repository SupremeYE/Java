package practice;

public class ����ó��_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] StudentA = new int[7];//7�� ���� Array �Ҵ�
		int [] StudentB = new int[7];
		int [] StudentC = new int[7];
		
		for(int i=0;i<7;i++) {//������ �Ҵ��ϰ� ũ���
			StudentA[i]=(int)(Math.random()*100)+1;
			StudentB[i]=(int)(Math.random()*100)+1;
			if(StudentA[i]>StudentB[i]) StudentC[i]=StudentA[i];
			if(StudentB[i]>StudentA[i]) StudentC[i]=StudentB[i];
		}
		//��¹�
		System.out.print("�л� A����");
		for(int i=0;i<7;i++) {
			
			System.out.print(StudentA[i]+"\t");
		}
		System.out.print("\n�л� B����");
		for(int i=0;i<7;i++) {
			
			System.out.print(StudentB[i]+"\t");
		}
		System.out.print("\n�л� C����");
		for(int i=0;i<7;i++) {
			System.out.print(StudentC[i]+"\t");
		}

	}

}
