import java.util.Scanner;

public class Ex403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("q�� �Է��ϸ� ���α׷��� ����˴ϴ�");
		Scanner sc = new Scanner(System.in);//������ Ÿ���� ��ĳ��
		String inputData;
		boolean isContinue = true;
		while(isContinue) {
			System.out.print(">");
			inputData=sc.nextLine();
			System.out.println("input data : "+inputData);
			
			if(inputData.equals("q")) isContinue=false;
			
			
		}
		System.out.println("���α׷� ����");
	}//String ���ڿ� ����

}
