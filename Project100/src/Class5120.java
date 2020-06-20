import java.util.Scanner;

public class Class5120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("password를 설정>");
		String passwd=scanner.next();
		
		System.out.println("dictionary attack으로 password를 맞춰보겠습니다");
		String guessStr="";
		for(int i=0;i<passwd.length();i++) {
			for(int j=0;j<=255;j++) {
				if(passwd.charAt(i)==(char)j) {
					guessStr+=(char)j;
					System.out.println(i+"번째 글자. "+(j+1)+"번 attack으로 탐색완료. word:"+(char)j);
					break;
				}
			}
		}
		System.out.println("password: "+guessStr);
	}

}
