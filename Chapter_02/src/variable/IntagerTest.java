package variable;

public class IntagerTest {
	
	public static void main(String[] args) {
		
		byte bs = -127;
		System.out.println(bs);
		System.out.println(Byte.SIZE);//Byte�� �� ��Ʈ���� Ȯ���Ҽ��ִ�.
		
		//byte= bs2 = 127;
		//System.out.println(bs2);
		
		
		int iVal = 1234567890;//10�ڸ����� ����
		System.out.println(iVal);
		
		long lVal = 1234567890000000000l;
		System.out.println(lVal);//������ü�� 4����Ʈ�� �� �ڹٴ� �⺻������ ���ڸ� �������� ����
		
		long OVal = 10000000000l;
		System.out.println(OVal);
	}

}
