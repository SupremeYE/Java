import java.util.Scanner;

public class Class5120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("password�� ����>");
		String passwd=scanner.next();
		
		System.out.println("dictionary attack���� password�� ���纸�ڽ��ϴ�");
		String guessStr="";
		for(int i=0;i<passwd.length();i++) {
			for(int j=0;j<=255;j++) {
				if(passwd.charAt(i)==(char)j) {
					guessStr+=(char)j;
					System.out.println(i+"��° ����. "+(j+1)+"�� attack���� Ž���Ϸ�. word:"+(char)j);
					break;
				}
			}
		}
		System.out.println("password: "+guessStr);
	}

}
