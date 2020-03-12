package variable;

public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		int iCh = 66;
		System.out.println(iCh);
		System.out.println((char)iCh);
		
		//char ch2 = -66;//음수값은 들어갈수 없음
		
		char hangul = '\uAC00';//유니코드삽입 한글
		System.out.println(hangul);
		
		char ch2 = '한';
		System.out.println(ch2);
	}

}
