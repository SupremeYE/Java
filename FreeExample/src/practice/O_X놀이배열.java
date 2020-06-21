package practice;

import java.util.Scanner;

public class O_X놀이배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자배열크기>");
		int size=sc.nextInt();
		int[][] numArray= new int[size][size];
		int cnt1=0,cnt2=0,cnt3=0,cnt4=0;
		int i,j;
		//matrix생성
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				numArray[i][j]=(int)(Math.random()*2);
				if(numArray[i][j]==1) System.out.print("O\t");
				if(numArray[i][j]==0) System.out.print("X\t");
				
			}
			System.out.println("");
		}
		//가로세로 count생성
		//cnt1(가로)
		for(i=0;i<size;i++) {
			for(j=0;j<(size-2);j++) {
				if((numArray[i][j]==1) && (numArray[i][j+1]==1) &&(numArray[i][j+2]==1)) cnt1++;
				
			}
		}
		//cnt2(세로)
		for(i=0;i<(size-2);i++) {
			for(j=0;j<size;j++) {
				if((numArray[i][j]==1) && (numArray[i+1][j]==1)&&(numArray[i+2][j]==1)) cnt2++;
			}
		}
		//cnt3(오른쪽 방향 대각선)
		for(i=0;i<(size-2);i++) {
			for(j=0;j<(size-2);j++) {
				if((numArray[i][j]==1) && (numArray[i+1][j+1]==1)&&(numArray[i+2][j+2]==1)) cnt3++;

			}
		}
		//cnt4(왼쪽방향 대각선)
		for(i=0;i<(size-2);i++) {
			for(j=2;j<(size-2);j++) {
				if((numArray[i][j]==1) && (numArray[i+1][j-1]==1)&&(numArray[i+2][j+-2]==1)) cnt4++;

			}
		}
		System.out.println("가로: "+cnt1);
		System.out.println("세로: "+cnt2);
		System.out.println("대각선1: "+cnt3);
		System.out.println("대각선2: "+cnt4);
		
		
		
		
		
		

	}

}
