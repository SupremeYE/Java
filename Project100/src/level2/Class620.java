package level2;

public class Class620 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6개반 10명
		Division[]division=new Division[6];
		int i,j;
		for(i=0;i<6;i++) division[i]=new Division(10);
		
		for(i=0;i<6;i++) {
			System.out.println("***"+(i+1)+"반***");
			for(j=0;j<10;j++) {
				System.out.println(division[i].students[j].getEngScore()+","+division[i].students[j].getMathScore());
				
						
			}
			System.out.println("평균점수:"+division[i].calAverage());
		}

	}

}
