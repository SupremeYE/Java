package level2;

public class Calculator3 {
	
	int randomNumber(int range) {
		int number;
		number = (int)(Math.random()*range)+1;
		return number;
	}
	
	void numberGenerate(int n, int range) {
		int i,trial;
		for(i=1;i<=n;i++) {
			trial=randomNumber(range);
			System.out.println(i+"¹øÂ° random number:"+trial);
		}
	}

}
