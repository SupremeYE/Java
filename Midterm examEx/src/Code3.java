import java.util.*;
public class Code3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Random generator = new Random(); 
      System.out.println("20191216 ÀÌ¿¹Àº");
      System.out.print("¶ó¿îµå ÀÔ·Â>");
      int round = sc.nextInt();
      int A_money = 0, A_number;
      int B_money = 0, B_number;
      for(int i = 1; i <= round; ++i)
      {
         System.out.println("## "+i+" round.");
         A_money = B_money = 0;
         while(A_money < 30 && B_money < 30)
         {
            A_number = generator.nextInt(10)+1;
            B_number = generator.nextInt(10)+1;
            System.out.printf("A card : %d, B card : %d. ", A_number, B_number);
            if(A_number > B_number)
            {
               if(A_number >= 8)
               {
                  System.out.printf("A »ó±Ý%d¸¸¿ø È¹µæ\n", A_number*3);
                  A_money+=A_number*3;
               }
               else
               {
                  System.out.printf("A »ó±Ý%d¸¸¿ø È¹µæ\n", A_number);
                  A_money+=A_number;
               }
            }
            else if(A_number < B_number)
            {
               if(B_number >= 8)
               {
                  System.out.printf("B »ó±Ý%d¸¸¿ø È¹µæ\n", B_number*3);
                  B_money+=B_number*3;
               }
               else
               {
                  System.out.printf("B »ó±Ý%d¸¸¿ø È¹µæ\n", B_number);
                  B_money+=B_number;
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
