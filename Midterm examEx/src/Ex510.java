import java.util.Scanner;

public class Ex510 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String inputData;
		boolean isContinue=true;
		System.out.println("q�� ���ö����� �Է��� �޽��ϴ�");
		while (isContinue) {
			System.out.print(">");
			inputData=sc.next();
			
			if(inputData.equals("q")) isContinue=false; 
		}
		System.out.println("���α׷��� �����մϴ�");
	}

}
