package practice;

import java.util.Scanner;

public class �޼ҵ���_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number,range;
		System.out.println("random ������ random ������ �Է��ϼ���");
		
		System.out.print("radom ����");
		range=sc.nextInt();
		System.out.print("random ����>>");
		
		number=sc.nextInt();
		
		Calcul3 cal=new Calcul3();
		
		cal.numberGernerate(number,range);
							//����     //����

	}

}
