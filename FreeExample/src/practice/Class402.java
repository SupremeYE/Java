package practice;

public class Class402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++) {
			int score=(int)(Math.random()*100)+1;
			if(score>=90) {
				System.out.println("Grade : A");
			}
			else if(score>=80) {
				System.out.println("Grade : B");
				
			}
			else if(score>=70) {
				System.out.println("Grade : c");
			}
			else
				System.out.println("Grade : F");
		}

	}

}
