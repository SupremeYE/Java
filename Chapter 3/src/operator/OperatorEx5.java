package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 0B00001010; //10
		int num2 = 0B00000101; //5
		
		System.out.println(num1 & num2);//�Ѷ� 1�� ��Ʈ�� ����
		System.out.println(num1 | num2); 
		System.out.println(num1 ^ num2); 
		

		System.out.println(num2<<1); 
		System.out.println(num2<<2); //5*2�� 2��
		System.out.println(num2<<3); //5*2��3��
		System.out.println(num2); //���� �������� ���� ���ϰ��Ϸ��� ���Կ����ڤѤ� ����ؾ���
		//System.out.println(num2<<=3);
		
		System.out.println(num2>>2);// 5/2��2�� ��, ���� ���
		System.out.println(num2>>1);// 5/2��1��
		
		
	}

}
