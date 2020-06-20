
public class Ex2122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char startChar ='a';
		char endChar ='z';
		
		char temp=startChar;
		while(temp<=endChar) {
			System.out.println("small char: "+temp);
			temp++; 
			//temp=temp+1;
			//4바이트의 결과인데 char타입 2바이트에 넣으려니까 error
			//큰값을 작은값에 넣을수없다.
		}
		

	}

}
