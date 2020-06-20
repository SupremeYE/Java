package practice;

import java.util.Scanner;

public class FirstExamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("¶ó¿îµå ÀÔ·Â>");
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
						System.out.println("A »ó±Ý"+Acard*3+"¸¸¿ø È¹µæ");
						AWinMoney+=Acard*3;
					}
					else {
						System.out.println("A »ó±Ý"+Acard+"¸¸¿ø È¹µæ");
						AWinMoney+=Acard;
					}
					
				}
				else if(Acard<Bcard) {
					if(Bcard>=8) {
						System.out.println("B »ó±Ý"+Bcard*3+"¸¸¿ø È¹µæ");
						BWinMoney+=Bcard*3;
					}
					else {
						System.out.println("B »ó±Ý"+Bcard+"¸¸¿ø È¹µæ");
						BWinMoney+=Bcard*3;
					}
					
					
				}
				else {
					System.out.println("»ó±Ýº¯È­¾øÀ½");
				}
				if(AWinMoney>30||BWinMoney>30) break;
			}
			System.out.println("A »ó±ÝÃÑ¾× : "+AWinMoney+", B »ó±ÝÃÑ¾× : "+BWinMoney);
			
		}
		
		
		
		

	}

}
