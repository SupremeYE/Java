import java.util.Scanner;

public class Class408 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1~100까지의 숫자를 맞춰보세요");
		int targetNumber = (int)(Math.random()*100)+1;
		boolean isCountinue = true;
		int inputNumber;
		Scanner scanner = new Scanner(System.in);
		
		while (isCountinue) {
			System.out.print("숫자를 입력하시요>");
			inputNumber = scanner.nextInt();
			
			if(targetNumber>inputNumber) {
				System.out.println("입력한 숫자보다 큽니다");
			}
			else if (targetNumber<inputNumber) {
				System.out.println("입력한 숫자보다 작습니다");
			}else {
				isCountinue = false;
				System.out.println("정답입니다");
				
			}
		}
		System.out.println("프로그램을 종료합니다");

	}

}
