package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int i=2;
		boolean value = ((num1 =num1 + 10)<10) || ((i=i+2)<10);
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value);//�ܶ�ȸ����
		
		int num2 = 10;
		int num3 = 20;
		
		int max = (num2>num3)?num2:num3;
		System.out.println(max); //���׿�����
		
	}

}
