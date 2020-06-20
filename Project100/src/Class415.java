import java.util.Scanner;

public class Class415 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diceNumber;
		int totalRound, currentRound=1;
		boolean isContinue =true;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("¶ó¿îµå ÀÔ·Â>");
		totalRound=scanner.nextInt();
		
		while(isContinue) {
			boolean eachRoundContiner=true;
			int sum = 0;
			System.out.print(currentRound+"round.");
			while(eachRoundContiner) {
				diceNumber = (int)(Math.random()*6)+1;
				if(diceNumber==3)eachRoundContiner=false;
				sum+=diceNumber;
				System.out.print(diceNumber+" ");
				
			}
			System.out.println("È¹µæ»ó±Ý: "+sum);
			if(totalRound==currentRound) isContinue=false;
			currentRound++;
					
		}

	}

}
