import java.util.Scanner;

public class Ex_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("������ ������ �Է��Ͻÿ�>");
		k=sc.nextInt();
		for(int i=0, j=0;i<k;i++) {
			for(j=i;j<k;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
