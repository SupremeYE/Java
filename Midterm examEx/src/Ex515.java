import java.util.Scanner;

public class Ex515 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڹ迭 ũ��>");
		int size=sc.nextInt();
		int [][]matrix = new int[size][size];
		int i,j;
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0;
		System.out.println("random�� ���ڹ迭 ���");
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				matrix[i][j] = (int)(Math.random()*2);
				if(matrix[i][j]==1)System.out.print("O\t");
				if(matrix[i][j]==0)System.out.print("X\t");
			}
			System.out.println("");
		}
		for(i=0;i<size;i++) {
			for(j=0;j<size-2;j++) {
				if((matrix[i][j]==1)&&(matrix[i][j]==1)&&(matrix[i][j+2]==1)) cnt1++;
				
			}
		}
		for(i=0;i<size-2;i++) {
			for(j=0;j<size;j++) {
				if((matrix[i][j]==1)&&(matrix[i][j]==1)&&(matrix[i+2][j]==1)) cnt2++;
					
			}
		}
		for(i=0;i<size-2;i++) {
				for(j=0;j<size-2;j++) {
					if((matrix[i][j]==1)&&(matrix[i+1][j]==1)&&(matrix[i+2][j]==1)) cnt3++;
						
					}
		}
		for(i=0;i<size-2;i++) {
				for(j=2;j<size;j++) {
						if((matrix[i][j]==1)&&(matrix[i+1][j-2]==1)&&(matrix[i+2][j-2]==1)) cnt4++;
						
						}
	
		}
		System.out.println("���� : "+cnt1);
		System.out.println("���� : "+cnt2);
		System.out.println("�밢��1 : "+cnt3);
		System.out.println("�밢��2 : "+cnt4);


}
		}
	
