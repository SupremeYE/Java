
public class Ex402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++) {
			
			int num=(int)(Math.random()*100)+1;
			System.out.println(num);
			if (num>=90) {
				System.out.println("Grade : A");
			}else if (num>=80) {
				System.out.println("Grade : B");
				
				
			}else if (num>=70) {
				System.out.println("Grade : C");
			}else if (num>=60) {
				System.out.println("Grade : D");
			}else
				System.out.println("Grade : F");
		}
	}

}
