package level2;

import java.util.Scanner;

public class Class608 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isContinue = true;
		Scanner sc=new Scanner(System.in);
		
		Car4 myCar = new Car4();
		int choice;
		
		while (isContinue) {
			System.out.println("1.�ӵ����� 2. �ӵ����� 3. �ӵ���ȸ 4.����");
			System.out.print(">");
			choice=sc.nextInt();
			
			if(choice==1) {myCar.add(10);}
			if(choice==2) {myCar.sub(10);}
			if(choice==3) {myCar.print();}
			if(choice==4) {isContinue=false;}
		}
		System.out.println("���α׷�����");

	}

}
