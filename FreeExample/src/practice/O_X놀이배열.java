package practice;

import java.util.Scanner;

public class O_X���̹迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���ڹ迭ũ��>");
		int size=sc.nextInt();
		int[][] numArray= new int[size][size];
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0;
		int i,j;
		//matrix����
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				numArray[i][j]=(int)(Math.random()*2);
				if(numArray[i][j]==1) System.out.print("O\t");
				if(numArray[i][j]==0) System.out.print("X\t");
				
			}
			System.out.println("");
		}
		//���μ��� count����
		//cnt1(����)
		for(i=0;i<size;i++) {
			for(j=0;j<(size-2);j++) {
				if((numArray[i][j]==1) && (numArray[i][j+1]==1) &&(numArray[i][j+2]==1)) cnt1++;
				
			}
		}
		//cnt2(����)
		for(i=0;i<(size-2);i++) {
			for(j=0;j<size;j++) {
				if((numArray[i][j]==1) && (numArray[i+1][j]==1)&&(numArray[i+2][j]==1)) cnt2++;
			}
		}
		//cnt3(������ ���� �밢��)
		for(i=0;i<(size-2);i++) {
			for(j=0;j<(size-2);j++) {
				if((numArray[i][j]==1) && (numArray[i+1][j+1]==1)&&(numArray[i+2][j+2]==1)) cnt3++;

			}
		}
		//cnt4(���ʹ��� �밢��)
		for(i=0;i<(size-2);i++) {
			for(j=2;j<(size-2);j++) {
				if((numArray[i][j]==1) && (numArray[i+1][j-1]==1)&&(numArray[i+2][j+-2]==1)) cnt4++;

			}
		}
		System.out.println("����: "+cnt1);
		System.out.println("����: "+cnt2);
		System.out.println("�밢��1: "+cnt3);
		System.out.println("�밢��2: "+cnt4);
		
		
		
		
		
		

	}

}
