
public class Ex400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0<=Math.random()<1
		//0<=Math.random()*6<6
		//0<=(int)Math.random()*6<=5
		//1<=(int)Math.random()*6)+1<6
		int num;
		boolean isContinue =true; //계속할꺼냐 yes란 의미
		while (isContinue) { //이값이 true면 계속 반복
			num=(int)(Math.random()*6)+1;
			System.out.println("random dice is  "+num);
			if(num==3) {
				System.out.println("프로그램종료");
				isContinue=false;
			}
		}
	}

}
