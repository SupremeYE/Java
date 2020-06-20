
public class Ex512 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String passwd="Java Class";
		System.out.println("Original Password : "+passwd);
		String guessStr = "";
		//char [] trial = new char[10];
		
		int i,j;
		for (i=0;i<passwd.length();i++) {
			for(j=0;j<=255;j++) {
				if(passwd.charAt(i)==(char)j) {
					guessStr+=(char)j;
					break;
				}
			}
		}
		System.out.println("Guesing Password : "+guessStr);
		
	}

}
