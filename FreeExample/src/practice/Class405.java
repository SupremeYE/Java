package practice;

public class Class405 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dice1,dice2,dice3; //변수지정
		boolean isContinue=true;
		int num=1; //횟수변수
		
		while(isContinue) {
			dice1=(int)(Math.random()*6)+1; //랜덤한 수 할당
			dice2=(int)(Math.random()*6)+1;
			dice3=(int)(Math.random()*6)+1;
			
			System.out.println(num+"th\t"+"dice1:"+dice1+"\tdice2:"+dice2+"\tdice3:"+dice3);
			
			if((dice1==dice2) && (dice2==dice3)) isContinue=false; //3개의 주사위가 같을 결우
			num++; //횟수증가
			
		}
		System.out.println("프로그램을 종료합니다");

	}

}
