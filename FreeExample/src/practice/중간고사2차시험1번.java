package practice;

import java.util.Scanner;

public class �߰����2������1�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("20191216 �̿���\n");
		Scanner sc = new Scanner(System.in);
		String matrix[] = {"Ȩ��", "��Ÿ", "��Ÿ", "�ƿ�", "�ƿ�", "�ƿ�", "�ƿ�", "�ƿ�", "�ƿ�", "�ƿ�"};  
		int player[][];
		
		System.out.print("player ��>");
		int p = sc.nextInt();
		player = new int[p][2];	// [i][0] : ��Ÿ, [i][1] : Ȩ�� 
		
		System.out.print("Ÿ��Ƚ��>");
		int Hit_count = sc.nextInt();
		
		
		
		System.out.println("===========================");
		System.out.println("*** Ÿ�ڱ�� ***");
		for(int i = 0; i < p; i++)
		{
			System.out.print((i+1)+"��° Ÿ�� :");
			for(int j = 0; j < Hit_count; j++)
			{
				int k = (int)(Math.random() * 10);
				System.out.print("\t"+matrix[k]);
				if(matrix[k] == "��Ÿ")
					player[i][0]++;
				else if(matrix[k] == "Ȩ��")
					player[i][1]++;
				
			}
			System.out.println("");
		}
		
		System.out.println("===========================");
		
		System.out.println("*** Ÿ�ں� ��� ***");
		for(int i = 0; i < p; i++)
		{
			System.out.print((i+1)+"��° Ÿ�� : ");
			System.out.println(Hit_count+" Ÿ�� "+player[i][0]+" ��Ÿ. " + player[i][1]+" Ȩ��!!!");
			
		}
	}

}
