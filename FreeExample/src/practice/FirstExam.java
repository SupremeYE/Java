package practice;
import java.util.Scanner;

public class FirstExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  System.out.println("20191216 ÀÌ¿¹Àº");
			  
		      Scanner sc = new Scanner(System.in);
		      System.out.print("¶ó¿îµå ÀÔ·Â>");
		      int totalround = sc.nextInt();
		      int A_money = 0, cardA;
		      int B_money = 0, cardB;
		      
		      for(int i = 1; i <= totalround; ++i)
		      {
		         System.out.println("## "+i+" round.");
		         A_money = B_money = 0;
		         while(A_money < 31 && B_money < 31)
		         {
		            cardA = (int)(Math.random()*10)+1;
		            cardB = (int)(Math.random()*10)+1;
		            System.out.printf("A card : %d, B card : %d. ", cardA, cardB);
		            if(cardA > cardB)
		            {
		               if(cardA >= 8)
		               {
		                  System.out.printf("A »ó±Ý%d¸¸¿ø È¹µæ\n", cardA*3);
		                  A_money+=cardA*3;
		               }
		               else
		               {
		                  System.out.printf("A »ó±Ý%d¸¸¿ø È¹µæ\n", cardA);
		                  A_money+=cardA;
		               }
		            }
		            else if(cardA < cardB)
		            {
		               if(cardB >= 8)
		               {
		                  System.out.printf("B »ó±Ý%d¸¸¿ø È¹µæ\n", cardB*3);
		                  B_money+=cardB*3;
		               }
		               else
		               {
		                  System.out.printf("B »ó±Ý%d¸¸¿ø È¹µæ\n", cardB);
		                  B_money+=cardB;
		               }
		            }
		            else
		            {
		               System.out.printf("»ó±Ýº¯È­¾øÀ½\n");
		            }
		            if(A_money > 30 || B_money > 30)
		               break;
		         }
		         
		         System.out.printf("A »ó±ÝÃÑ¾× : %d, B »ó±ÝÃÑ¾× : %d\n", A_money, B_money);
		      }
		      
		      
		   }

		}
		
	


