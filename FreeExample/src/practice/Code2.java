package practice;
import java.util.Scanner;
public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ī��� �Է�>");
		int totalRound;
		totalRound=sc.nextInt();
		int winA = 0, winB = 0;
		
		int matrix[][]=new int[2][3];
		
			String strWin = "";
			for(int i=0;i<=totalRound;i++) {
				
			
			//2���� �ɶ����� �ݺ�
			while(winA < 2 && winB < 2) {
				for(int j=0;j<3;j++) {//���������� ��������
					//����=1 ����=2 ��=3(0)
					matrix[i][j]=(int)(Math.random()*3)+1;
					if(matrix[i][j]==1) System.out.print("����\t");
					if(matrix[i][j]==2) System.out.print("����\t");
					if(matrix[i][j]==3) System.out.print("��\t");
				}
				
				System.out.print("�����Ǵܰ��. \t");
				for(int j=0;j<10;j++) {//ù��° ���=0 �ι�° ���=1 3���� ������ ���� ����
					//0��°�� ����or��  
					if(matrix[0][j] %3==(matrix[1][j]+1)%3) { System.out.print("1����\t");
					winA++;}
					if(matrix[1][j] %3==(matrix[0][j]+1)%3) {System.out.print("2����\t");
					winB++;}
					if(matrix[0][j]==matrix[1][j]) System.out.print("���\t");
				}

				System.out.printf("A : %d , B : %d ",winA,winB);
			}
		
		
			}
		
		
		
		System.out.printf("\n������� \t1��Win: %d,\t2��Win: %d,\t���: %d",winA,winB,(10-winA-winB));

		
		

	}

}
