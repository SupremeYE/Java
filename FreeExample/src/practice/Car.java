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
		System.out.println("초기세팅");
		
		A=new KumhoTire();
		B=new KumhoTire();
		C=new KumhoTire();
		D=new KumhoTire();
		
		
	}
	void tireInfo() {
		System.out.println("앞바퀴. 왼쪽"+A.currentDistance+","+A.maxDistance);
		System.out.println("앞바퀴. 오른쪽"+C.currentDistance+","+B.maxDistance);
		System.out.println("뒷바퀴. 왼쪽"+B.currentDistance+","+C.maxDistance);
		System.out.println("뒤바퀴. 왼쪽"+D.currentDistance+","+D.maxDistance);
	}
	
	void carDrive() {
		while(isContinue) {
			//10만큼 이동할때마다 타이어 정보 출력
			if(totalDistance%10==0) tireInfo();
			
			//각 타이어별로 1만큼 이동
			// 만야그ㅡ 타이어 교체가 필요하면 교체
			if(A.run()==1) {
				System.out.println("왼쪽. 앞바퀴. 타이어 구매필요. 1. 금호 2.한국");
				choice=scanner.nextInt();
				if(choice==1) {
					A=new KumhoTire();
					System.out.println("금호타이어 장착완료");
				}else {
					A=new HankookTire();
					System.out.println("한국타이어 장착완료");
				}
				A.currentDistance++;
			}else {
				A.currentDistance++;
			}
			
			if(B.run()==1) {
				System.out.println("왼쪽. 뒤바퀴. 타이어 구매필요. 1. 금호 2.한국");
				choice=scanner.nextInt();
				if(choice==1) {
					B=new KumhoTire();
					System.out.println("금호타이어 장착완료");
				}else {
					B=new HankookTire();
					System.out.println("한국타이어 장착완료");
				}
				B.currentDistance++;
			}
			
			if(C.run()==1) {
				System.out.println("오른쪽. 앞바퀴. 타이어 구매필요. 1. 금호 2.한국");
				choice=scanner.nextInt();
				if(choice==1) {
					C=new KumhoTire();
					System.out.println("금호타이어 장착완료");
				}else {
					C=new HankookTire();
					System.out.println("한국타이어 장착완료");
				}
				C.currentDistance++;
			}
			
			
			if(D.run()==1) {
				System.out.println("오른쪽. 뒤바퀴. 타이어 구매필요. 1. 금호 2.한국");
				choice=scanner.nextInt();
				if(choice==1) {
					D=new KumhoTire();
					System.out.println("금호타이어 장착완료");
				}else {
					D=new HankookTire();
					System.out.println("한국타이어 장착완료");
				}
				D.currentDistance++;
			}
			totalDistance++;
			if(totalDistance>=300) isContinue=false;
			
			
			
		}
	}

}
