package practice;

import java.util.Scanner;

public class 주사위라운드게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tatalRound, currentRound=1;
		int diceNum;
		boolean isContinue=true;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("몇 라운드로 진행할까요?>");
		tatalRound=sc.nextInt();
		while(isContinue) {
			boolean eachRoundContinue=true;
			int sum=0;
			System.out.print(currentRound+" round.");
			while(eachRoundContinue) {
				diceNum=(int)(Math.random()*6)+1;
				if(diceNum==3) eachRoundContinue=false;
				sum+=diceNum;
				System.out.print(diceNum+" ");
			}
			System.out.println("획득상금 : "+sum+" 만원");
			if(tatalRound==currentRound) isContinue=false;
			currentRound++;
		}
		

	}

}
