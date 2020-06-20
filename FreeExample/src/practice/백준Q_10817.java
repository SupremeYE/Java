package practice;

import java.util.Scanner;

public class 백준Q_10817 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n= sc.nextInt();//배열범위지정
		int x=sc.nextInt();//정수값지정
		
		int[] a=new int[n];//입력받은n의 배열할당후선언(동적할당)
		for(int i=0;i<a.length; i++) {
			a[i]=sc.nextInt();//배열의 크기만큼 값을 지정
			
		}
		
		for(int i=0;i<a.length;i++) {//배열의크기
			if(a[i]<x) {//지정한정수보다 작은배열의수까지
				System.out.print(a[i]+" ");
			}
		}
	}
}
