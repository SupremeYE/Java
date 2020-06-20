package practice;

public class Practice_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//continue를 사용해서 짝수인 수만 출력하라
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				continue;
			}
		
			System.out.println(i);
		}
		

	}

}
