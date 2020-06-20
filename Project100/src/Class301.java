
public class Class301 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j;
		String temp="";//초기화
		for(i=1;i<=10;i++) {//세로
			for(j=1;j<=i;j++) {//가로
				temp=temp+"*";
			}
			System.out.println(temp);
			temp="";  
		}
	}

}
