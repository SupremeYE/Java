package variable;

public class ImplicitConverSion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte bNum = 10;//1����Ʈ�� ���̰�
		int iNum = bNum;//int�� 4����Ʈ ���̱� ������ 1����Ʈ���� ���͵� ������
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20; //�� �����Ѽ�
		float fNum = iNum2;//fNum�� �� ������ ��
		
		//�Ǽ��� �� ������ ���̰� ǥ�������� �ξ� ���� �׷��� ��� ������ �Ǽ��� ����ȯ �ɶ� �ƹ��� ����������
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;//���⼭�� 2���� ����ȯ�� �Ͼ ����->float/ float�� ����� double�� �ٲ�
		System.out.println(dNum);
	}

}
