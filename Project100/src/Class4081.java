import java.util.Scanner;

public class Class4081 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int targetNumber;
		int minNumber =1, maxNumber=100;
		int guessNumber;
		int tryCount =1;
		boolean isContinue = true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("target number 입력>");
		targetNumber = scanner.nextInt();
		
		while(isContinue) {
			
			guessNumber =(minNumber +maxNumber)/2;
			if (guessNumber > targetNumber) {
				System.out.println(tryCount +"th try. GuessNumber : "+guessNumber+". TargetNumber is small");
				maxNumber =guessNumber;
			}
			
			else if(guessNumber<targetNumber) {
				System.out.println(tryCount +"th try. GuessNumber : "+guessNumber+". TargetNumber is big");
				minNumber=guessNumber;
				
			}
			
			else {
				isContinue = false;
				System.out.println(tryCount +"th try. GuessNumber : "+guessNumber+". Correct!!!");
				
			}
			tryCount++;

		}
		System.out.println("프로그램 종료");

	}

}
