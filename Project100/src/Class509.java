
import java.util.Scanner;
public class Class509 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArray = new String[3];
		Scanner scanner = new Scanner(System.in);
		int i;
		System.out.println("String 3���� �Է��ϼ���");
		for(i=0;i<3;i++) {
			System.out.print(">");
			strArray[i]=scanner.nextLine();
			
		}
		System.out.println("=================================");
		for(i=0;i<3;i++) {System.out.println((i+1)+"��°: "+strArray[i]);}
		System.out.println("=================================");

	}

}
