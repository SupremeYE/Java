package practice;

public class 카드게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2개의 팀은 각각 2장의 카드를 받고(1~10사이) 두수의 합의 일의자리가 큰 팀이 승리
		//어느 한팀이 10번을 이기면 게임이 종료됨
		int cardA1, cardA2;
		int cardB1, cardB2;
		boolean isContinue=true;
		int teamAwin=0,teamBwin=0;
		int sum1,sum2;
		
		while(isContinue) {
			cardA1=(int)(Math.random()*10)+1;
			cardA2=(int)(Math.random()*10)+1;
			cardB1=(int)(Math.random()*10)+1;
			cardB2=(int)(Math.random()*10)+1;
			//합의 일의자리수
			sum1=(cardA1+cardA2)%10;
			sum2=(cardB1+cardB2)%10;
			
			if(sum1>sum2) teamAwin++;
			if(sum1<sum2) teamBwin++;
			
			
			System.out.println("A:"+cardA1+","+cardA2+"\tB:"+cardB1+","+cardB2+"\tA: "+teamAwin+", B:"+teamBwin);
			
			if((teamAwin==10) ||(teamBwin==10)) isContinue=false;
		}
		
	}

}
