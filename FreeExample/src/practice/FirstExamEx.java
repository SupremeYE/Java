package practice;

import java.util.Scanner;

public class FirstExamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("���� �Է�>");
		int totalRound=sc.nextInt();
		int AWinMoney=0,BWinMoney=0;
		int Acard,Bcard;
		
		for(int i=1;i<=totalRound;++i) {
			System.out.println("## "+i+" round.");
			AWinMoney=BWinMoney=0;
			while(AWinMoney<31 && BWinMoney<31) {
				Acard=(int)(Math.random()*10)+1;
				Bcard=(int)(Math.random()*10)+1;
				
				System.out.print("A card : "+Acard+", B card :"+Bcard+" ");
				if(Acard>Bcard) {
					if(Acard>=8) {
						System.out.println("A ���"+Acard*3+"���� ȹ��");
						AWinMoney+=Acard*3;
					}
					else {
						System.out.println("A ���"+Acard+"���� ȹ��");
						AWinMoney+=Acard;
					}
					
				}
				else if(Acard<Bcard) {
					if(Bcard>=8) {
						System.out.println("B ���"+Bcard*3+"���� ȹ��");
						BWinMoney+=Bcard*3;
					}
					else {
						System.out.println("B ���"+Bcard+"���� ȹ��");
						BWinMoney+=Bcard*3;
					}
					
					
				}
				else {
					System.out.println("��ݺ�ȭ����");
				}
				if(AWinMoney>30||BWinMoney>30) break;
			}
			System.out.println("A ����Ѿ� : "+AWinMoney+", B ����Ѿ� : "+BWinMoney);
			
		}
		
		
		
		

	}

}
