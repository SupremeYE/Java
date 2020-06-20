import java.util.Scanner;

public class Class410 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자입력>");
		int num=scanner.nextInt();
		
		int sum=0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) sum+=i;
			System.out.println("i값:"+i+",현재합:"+sum);
			
		}
		System.out.println("최종결과: "+sum);
		
	}//입력한 값까지의 짝수의 합

}
