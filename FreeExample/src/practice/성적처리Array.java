package practice;

import java.util.Scanner;

public class ����ó��Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("�л� ���� �Է��ϼ���");
		int studentnum;//�л���
		studentnum=sc.nextInt();//�л� �� �Է�
		
		int [] studentScore=new int[studentnum];//�Է��� �л� ����ŭ �迭�Ҵ�
		
		int i;
		for(i=0;i<studentnum;i++) {
			studentScore[i]=(int)(Math.random()*100)+1;//������ �Ҵ�
			System.out.print(studentScore[i]+",");//���� ���� ���
		}
		int max=0,min=100,sum=0;//�ִ��ּ��� �ʱⰪ����
		for(i=0;i<studentnum;i++) {
			if(min>studentScore[i]) min=studentScore[i];
			if(max<studentScore[i]) max=studentScore[i];
			sum+=studentScore[i];
		}
		System.out.println(" ");
		
		float average=sum/studentnum;//��ձ��ϱ�
		System.out.println("max:"+max+", min:"+min+", average:"+average);
	}

}
