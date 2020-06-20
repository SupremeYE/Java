package practice;

public class Class301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,j;
		String temp="";//여백할당
		for(i=1;i<=10;i++) {//세로줄
			for(j=1;j<=i;j++) {//가로줄
				temp=temp+"*";
			}
			System.out.println(temp);
			temp="";//줄바꿈역할
		}

	}

}
