import java.util.Scanner;

public class Ex517 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("���ڱ�������>");
		Scanner sc=new Scanner(System.in);
		int strLength=sc.nextInt();
		
		char startChar='A';
		char endChar='Z';
		int gap = (int)(endChar - startChar);
		int randNumber;
		
		int i;
		String randStr="";
		for(i=0;i<strLength;i++) {
			randNumber=(int)(Math.random()*gap)+(int)startChar;
			randStr+=(char)randNumber;
		}
		System.out.println(strLength+"������ random ���ڿ�"+randStr);
		
	}

}
