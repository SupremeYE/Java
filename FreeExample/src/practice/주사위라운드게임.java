package practice;

import java.util.Scanner;

public class �ֻ���������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tatalRound, currentRound=1;
		int diceNum;
		boolean isContinue=true;
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�� ����� �����ұ��?>");
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
			System.out.println("ȹ���� : "+sum+" ����");
			if(tatalRound==currentRound) isContinue=false;
			currentRound++;
		}
		

	}

}
