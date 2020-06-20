package level2;

public class NumberGenerator {
	
	static int numberGenerate() {
		return (int)(Math.random()*100+1);
	}
	static int numberGenerate(int num) {
		
		return (int)(Math.random()*num)+1;
	}
	static int numberGenerate(int min, int max) {
	
		return (int)(Math.random()*(max-min))+min;
	}

}
