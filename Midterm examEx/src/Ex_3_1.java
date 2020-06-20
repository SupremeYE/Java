import java.util.Scanner;

public class Ex_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력하시오>");
		k=sc.nextInt();
		for(int i=0, j=0;i<k;i++) {
			for(j=i;j<k;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
