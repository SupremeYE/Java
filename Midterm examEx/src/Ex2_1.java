import java.util.Scanner;
public class Ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	      
	      int money, a, b, c, d, e, f, g;
	      //a = 5����, b = 1����, c = 1õ��, d = 100��, e = 50��, f = 10��, g = 1��
	      
	      System.out.print("�ݾ��� �Է��Ͻÿ�>>");
	      money = sc.nextInt();
	      
	      a = money / 50000;
	      money = money - (a * 50000); //5���� ���
	      
	      b = money / 10000;
	      money = money - (b * 10000); //1���� ���
	      
	      c = money / 1000;
	      money = money - (c * 1000); //1õ�� ���
	      
	      d = money / 100;
	      money = money - (d * 100); //100�� ���
	      
	      e = money / 50;
	      money = money - (e * 50); //50�� ���
	      
	      f = money / 10;
	      money = money - (f * 10); //10�� ���
	      
	      g = money; // 1�� ���
	      
	      System.out.println("�������� "+a+"��");
	      System.out.println("������ "+b+"��");
	      System.out.println("õ���� "+c+"��");
	      System.out.println("��� "+d+"��");
	      System.out.println("���ʿ� "+e+"��");
	      System.out.println("�ʿ� "+f+"��");
	      System.out.println("�Ͽ� "+g+"��");
	      
	      sc.close();
	   }

	
	}


