
public class C111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("���� 300�� �ѱ� �������� ��");
		int i=1,sum=0;
		int finalNumber=1;
		boolean isContinue = true;
		while (isContinue) {
			sum+=i;
			System.out.println(i+"th, ������:"+sum);
			if(sum>300) {
				isContinue=false;
				finalNumber=i-1;
			}
			i++;
			
		}
		System.out.println("������ ���ڴ�"+finalNumber+"�Դϴ�");

	}//2��° �϶��� 1+2 �̷������� 

}
