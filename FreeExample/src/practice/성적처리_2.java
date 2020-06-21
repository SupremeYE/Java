package practice;

public class 성적처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] StudentA = new int[7];//7개 과목 Array 할당
		int [] StudentB = new int[7];
		int [] StudentC = new int[7];
		
		for(int i=0;i<7;i++) {//랜덤수 할당하고 크기비교
			StudentA[i]=(int)(Math.random()*100)+1;
			StudentB[i]=(int)(Math.random()*100)+1;
			if(StudentA[i]>StudentB[i]) StudentC[i]=StudentA[i];
			if(StudentB[i]>StudentA[i]) StudentC[i]=StudentB[i];
		}
		//출력문
		System.out.print("학생 A점수");
		for(int i=0;i<7;i++) {
			
			System.out.print(StudentA[i]+"\t");
		}
		System.out.print("\n학생 B점수");
		for(int i=0;i<7;i++) {
			
			System.out.print(StudentB[i]+"\t");
		}
		System.out.print("\n학생 C점수");
		for(int i=0;i<7;i++) {
			System.out.print(StudentC[i]+"\t");
		}

	}

}
