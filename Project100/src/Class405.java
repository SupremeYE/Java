
public class Class405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("주사위 3개 숫자가 모두 일치할때까지 던집니다");
		int dice1, dice2, dice3;
		int num=1;
		boolean isContinue = true;
		
		while(isContinue) {
			dice1 = (int)(Math.random()*6)+1; //주사위 1-6
			dice2 = (int)(Math.random()*6)+1;
			dice3 = (int)(Math.random()*6)+1;
			
			System.out.println(num + "th\t dice1:"+ dice1+"\t dice2:"+dice2+"\t dice3:"+dice3);
			if((dice1==dice2) && (dice2==dice3)) {//AND연산으로 둘다 TURE여야 다 동일함
				isContinue=false; //같으면 탈출
			}
				
			num++; //실행하는 횟수 증가
			
			
		}
		System.out.println("프로그램을 종료합니다");
		

	}

}
