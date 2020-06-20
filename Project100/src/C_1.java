import java.util.Scanner;

public class C_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m,a,x;
		Scanner sc =new Scanner(System.in);
		m=sc.nextInt();
		a=sc.nextInt();
		for (int i=1; i<m; i++) {
		    if ((a*i) % m == 1) {
		        x = i;
		        System.out.println(x);
		    }
		}
		

	}

}
