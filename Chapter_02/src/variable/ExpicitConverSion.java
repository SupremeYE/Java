package variable;

public class ExpicitConverSion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* int i= 1000;
		byte bNum = i;*/ //4����Ʈ�� 1����Ʈ�� �Ҵ��ϴ°��� ����
		
		int i= 1000;
		byte bNum =(byte)i; //����� ����ȯ�� ����ؾ��� ��, ������������ ������ִ�.
		//byte�� -128~127���� �����ѵ� 1000�� �Ѿ���
		System.out.println(bNum);
		
		double dNum1 = 1.2;
		float fNum = 0.9f;
		
		int iNum1 =(int)dNum1 +(int)fNum;
		int iNum2 =(int)(dNum1 +fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		

	}

}
