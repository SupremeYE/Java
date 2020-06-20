import java.util.Scanner;

public class ExAa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "";
		String output ="";
		int tmp;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입려하세요");
		input=sc.nextLine();
		
		for(int i=0;i<input.length();i++) {
			
			tmp=(int)input.charAt(i);
			
			if((65<=tmp)&&(tmp<=90)) {
				output +=(char)(tmp+32);
				
			}else if ((97<=tmp)&&(tmp<=122)) {
				output+=(char)(tmp-32);
			}else {
				output+=(char)tmp;
			}
			
		}
		System.out.println("변환된 문자열: "+output);

	}

}
