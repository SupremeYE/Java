import java.util.Scanner;

public class Ex410_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("입력한 숫자까지의 홀수합을 계산합니다");
		System.out.print("숫자를 입력하세요>");
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i,sum=0;
		for(i=1;i<=num;i++) {
			if(i%2==1) sum+=i;
			System.out.println("i의 값:"+i+"현재값:"+sum);
		}
		System.out.println("최종결과: "+sum);

	}//입력한 값까지의 홀수의합

}
