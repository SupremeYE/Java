
public class Class406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int teamAScore, teamBScore;
		int teamAWinCount = 0, teamBWinCount = 0;
		boolean isCountinue = true;
		
		
		 
		while(isCountinue) {
			teamAScore=(int)(Math.random()*6+1);
			teamBScore=(int)(Math.random()*6+1);
			
			if(teamAScore > teamBScore) {
				teamAWinCount++;
				System.out.println("A : "+ teamAScore+", B: " + teamBScore+", Team A "+teamAWinCount+"Wins!" );
				
			}else if (teamAScore < teamBScore) {
				teamBWinCount++;
				System.out.println("A : "+ teamAScore+", B: " + teamBScore+", Team B "+teamBWinCount+"Wins!" );
				
				
			}else {
				System.out.println("A : "+ teamAScore+", B: " + teamBScore+", DRAW!" );
				
			}
			if (teamAWinCount==5) isCountinue=false; 
			
		}

	}

}
