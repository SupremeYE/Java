
public class Ex213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1='��';
		int unicode1=c1;//2����Ʈ�� ũ�⸦ 4����Ʈ�� ����
		System.out.println("c1 unicod = "+unicode1);
		
		char c2;;
		unicode1=unicode1+1;
		c2=(char)unicode1;
		System.out.println("���� �������� = "+c2);
		
		char c3='��';
		int unicode2=c3;
		System.out.println("c3 unicod = "+unicode2);
		
		char c4;
		unicode2=unicode2+1;
		c4=(char)unicode2;
		System.out.println("���� �������� = "+c4);
		
		
		

	}

}
