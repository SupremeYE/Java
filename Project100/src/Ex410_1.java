import java.util.Scanner;

public class Ex410_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�Է��� ���ڱ����� Ȧ������ ����մϴ�");
		System.out.print("���ڸ� �Է��ϼ���>");
		
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int i,sum=0;
		for(i=1;i<=num;i++) {
			if(i%2==1) sum+=i;
			System.out.println("i�� ��:"+i+"���簪:"+sum);
		}
		System.out.println("�������: "+sum);

	}//�Է��� �������� Ȧ������

}
