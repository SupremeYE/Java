import java.util.Scanner;
public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	      
	      int money, a, b, c, d, e, f, g;
	      //a = 5만원, b = 1만원, c = 1천원, d = 100원, e = 50원, f = 10원, g = 1원
	      
	      System.out.print("금액을 입력하시오>>");
	      money = sc.nextInt();
	      
	      a = money / 50000;
	      money = money - (a * 50000); //5만원 계산
	      
	      b = money / 10000;
	      money = money - (b * 10000); //1만원 계산
	      
	      c = money / 1000;
	      money = money - (c * 1000); //1천원 계산
	      
	      d = money / 100;
	      money = money - (d * 100); //100원 계산
	      
	      e = money / 50;
	      money = money - (e * 50); //50원 계산
	      
	      f = money / 10;
	      money = money - (f * 10); //10원 계산
	      
	      g = money; // 1원 계산
	      
	      System.out.println("오만원권 "+a+"매");
	      System.out.println("만원권 "+b+"매");
	      System.out.println("천원권 "+c+"매");
	      System.out.println("백원 "+d+"매");
	      System.out.println("오십원 "+e+"매");
	      System.out.println("십원 "+f+"매");
	      System.out.println("일원 "+g+"매");
	      
	      sc.close();
	   }

	
	}


