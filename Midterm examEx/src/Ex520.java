import java.util.Scanner;

public class Ex520 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("�����Է�>");
		Scanner sc=new Scanner(System.in);
		int inputValue=sc.nextInt();
		int i=2;
		int divideNum=inputValue;
		
		while (i<divideNum) {
			if(divideNum%i==0) {
				System.out.println("�μ�: "+1);
				divideNum/=i;
				i=2;
				
			}else i++;
		}
		System.out.println("�μ�:"+divideNum);
		System.out.println("���α׷� ����");

	}

}
