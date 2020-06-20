package practice;

public class Practice_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//while문을 이용해서 주사위번호 중 하나를 반복적으로 뽑되 6의 나오면 프로그램을 종료시킨다.
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num==6) {
				break;
			}
		}
		System.out.println("프로그램 종료");

	}

}
