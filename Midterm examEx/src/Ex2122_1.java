
public class Ex2122_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char startChar ='a';
		char endChar ='z';
		
		char temp=startChar;
		while(temp<=endChar) {
			System.out.println("small char: "+temp);
			temp+=3; 
			//temp=temp+1;
			//4����Ʈ�� ����ε� charŸ�� 2����Ʈ�� �������ϱ� error
			//ū���� �������� ����������.
		}
		

	}

}
