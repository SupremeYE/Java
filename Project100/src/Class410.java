import java.util.Scanner;

public class Class410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("�����Է�>");
		int num=scanner.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) sum+=i;
			System.out.println("i��:"+i+",������:"+sum);
			
		}
		System.out.println("�������: "+sum);
		
	}//�Է��� �������� ¦���� ��

}
