
public class Class301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		String temp="";//�ʱ�ȭ
		for(i=1;i<=10;i++) {//����
			for(j=1;j<=i;j++) {//����
				temp=temp+"*";
			}
			System.out.println(temp);
			temp="";  
		}
	}

}
