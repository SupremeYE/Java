package practice;

import java.util.Scanner;

public class ����Q_10817 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n= sc.nextInt();//�迭��������
		int x=sc.nextInt();//����������
		
		int[] a=new int[n];//�Է¹���n�� �迭�Ҵ��ļ���(�����Ҵ�)
		for(int i=0;i<a.length; i++) {
			a[i]=sc.nextInt();//�迭�� ũ�⸸ŭ ���� ����
			
		}
		
		for(int i=0;i<a.length;i++) {//�迭��ũ��
			if(a[i]<x) {//�������������� �����迭�Ǽ�����
				System.out.print(a[i]+" ");
			}
		}
	}
}
