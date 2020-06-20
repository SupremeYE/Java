package practice;

public class Clss400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num; //주사위의 숫자변수
		boolean isContinue=true; //반복문을 위한 조건설정
		
		while(isContinue) {
			num=(int)(Math.random()*6)+1; //주사위의 수를 랜덤하게 나오게만듦
			System.out.println("random dice is "+num);
			if(num==3) {//3일경우 특정문구출력
				System.out.println("프로그램종료");
				isContinue=false;//종료
			}
			
		}
		
		
		
	}

}
