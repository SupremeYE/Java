package practice;

public class A_B팀주사위게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int teamAScore,teamBScore; //팀 A,B의 점수변수
		int teamAwin=0,teamBwin=0; //팀 A,B의 이긴횟수
		boolean isContinue=true;
		
		while(isContinue) {
			teamAScore=(int)(Math.random()*6)+1;//랜덤한 수 할당
			teamBScore=(int)(Math.random()*6)+1;
			
			if(teamAScore>teamBScore) {//팀 A가 이길경우
				teamAwin++;//A팀의 이긴횟수를 증가
				System.out.println("A : "+teamAScore+", B :"+teamBScore+". Team A "+teamAwin+" Wins!!!");
				
			}
			else if(teamAScore<teamBScore) { //팀 B가 이겼을 경우
				teamBwin++;//팀B의 이긴횟수 증가
				System.out.println("A : "+teamAScore+", B :"+teamBScore+". Team B "+teamBwin+" Wins!!!");
				
			}
			else//비겼을 경우
				System.out.println("A : "+teamAScore+", B : "+teamBScore+". Draw!!");
				//A팀이 5번 이긴경우 프로그램종료
				if(teamAwin==5) isContinue=false;
		}
		

	}

}
