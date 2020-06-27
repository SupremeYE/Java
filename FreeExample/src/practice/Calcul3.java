package practice;

public class Calcul3 {
	//랜덤수 범위
	int randomNumber(int range) {
		int num;
		num=(int)(Math.random()*range)+1;
		return num;
	}
	
	//랜덤한 수 개수				//개수	//범위
	void numberGernerate(int n, int range) {
		int i,trial;
		for(i=1;i<=n;i++) {
			trial=randomNumber(range);
			System.out.println(i+"번째 random number : "+ trial);
		}
	}

}
