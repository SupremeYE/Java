package practice;

import java.util.Scanner;

public class Car {
	
	Tire A;
	Tire B;
	Tire C;
	Tire D;
	
	int choice;
	int totalDistance=0;
	Scanner scanner;
	boolean isContinue=true;
	
	Car()
	{
		A=new Tire();
		B=new Tire();
		C=new Tire();
		D=new Tire();
		
		scanner=new Scanner(System.in);
		System.out.println("�ʱ⼼��");
		
		A=new KumhoTire();
		B=new KumhoTire();
		C=new KumhoTire();
		D=new KumhoTire();
		
		
	}
	void tireInfo() {
		System.out.println("�չ���. ����"+A.currentDistance+","+A.maxDistance);
		System.out.println("�չ���. ������"+C.currentDistance+","+B.maxDistance);
		System.out.println("�޹���. ����"+B.currentDistance+","+C.maxDistance);
		System.out.println("�ڹ���. ����"+D.currentDistance+","+D.maxDistance);
	}
	
	void carDrive() {
		while(isContinue) {
			//10��ŭ �̵��Ҷ����� Ÿ�̾� ���� ���
			if(totalDistance%10==0) tireInfo();
			
			//�� Ÿ�̾�� 1��ŭ �̵�
			// ���߱פ� Ÿ�̾� ��ü�� �ʿ��ϸ� ��ü
			if(A.run()==1) {
				System.out.println("����. �չ���. Ÿ�̾� �����ʿ�. 1. ��ȣ 2.�ѱ�");
				choice=scanner.nextInt();
				if(choice==1) {
					A=new KumhoTire();
					System.out.println("��ȣŸ�̾� �����Ϸ�");
				}else {
					A=new HankookTire();
					System.out.println("�ѱ�Ÿ�̾� �����Ϸ�");
				}
				A.currentDistance++;
			}else {
				A.currentDistance++;
			}
			
			if(B.run()==1) {
				System.out.println("����. �ڹ���. Ÿ�̾� �����ʿ�. 1. ��ȣ 2.�ѱ�");
				choice=scanner.nextInt();
				if(choice==1) {
					B=new KumhoTire();
					System.out.println("��ȣŸ�̾� �����Ϸ�");
				}else {
					B=new HankookTire();
					System.out.println("�ѱ�Ÿ�̾� �����Ϸ�");
				}
				B.currentDistance++;
			}
			
			if(C.run()==1) {
				System.out.println("������. �չ���. Ÿ�̾� �����ʿ�. 1. ��ȣ 2.�ѱ�");
				choice=scanner.nextInt();
				if(choice==1) {
					C=new KumhoTire();
					System.out.println("��ȣŸ�̾� �����Ϸ�");
				}else {
					C=new HankookTire();
					System.out.println("�ѱ�Ÿ�̾� �����Ϸ�");
				}
				C.currentDistance++;
			}
			
			
			if(D.run()==1) {
				System.out.println("������. �ڹ���. Ÿ�̾� �����ʿ�. 1. ��ȣ 2.�ѱ�");
				choice=scanner.nextInt();
				if(choice==1) {
					D=new KumhoTire();
					System.out.println("��ȣŸ�̾� �����Ϸ�");
				}else {
					D=new HankookTire();
					System.out.println("�ѱ�Ÿ�̾� �����Ϸ�");
				}
				D.currentDistance++;
			}
			totalDistance++;
			if(totalDistance>=300) isContinue=false;
			
			
			
		}
	}

}
