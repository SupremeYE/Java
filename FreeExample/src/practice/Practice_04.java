package practice;

public class Practice_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//이것이 자바다 134쪽에 4번문제 주사위의 합이 5가될때 프로그램종료시키기
		int num1=0;
		int num2=0;
		while(num1+num2!=5) {
			num1=(int)(Math.random()*6)+1;
			num2=(int)(Math.random()*6)+1;
			System.out.println(num1+" "+num2);
		}
		

	}

}
