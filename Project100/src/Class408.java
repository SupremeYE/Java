import java.util.Scanner;

public class Class408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1~100������ ���ڸ� ���纸����");
		int targetNumber = (int)(Math.random()*100)+1;
		boolean isCountinue = true;
		int inputNumber;
		Scanner scanner = new Scanner(System.in);
		
		while (isCountinue) {
			System.out.print("���ڸ� �Է��Ͻÿ�>");
			inputNumber = scanner.nextInt();
			
			if(targetNumber>inputNumber) {
				System.out.println("�Է��� ���ں��� Ů�ϴ�");
			}
			else if (targetNumber<inputNumber) {
				System.out.println("�Է��� ���ں��� �۽��ϴ�");
			}else {
				isCountinue = false;
				System.out.println("�����Դϴ�");
				
			}
		}
		System.out.println("���α׷��� �����մϴ�");

	}

}
