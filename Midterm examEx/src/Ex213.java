
public class Ex213 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c1='가';
		int unicode1=c1;//2바이트의 크기를 4바이트에 넣음
		System.out.println("c1 unicod = "+unicode1);
		
		char c2;;
		unicode1=unicode1+1;
		c2=(char)unicode1;
		System.out.println("가의 다음글자 = "+c2);
		
		char c3='이';
		int unicode2=c3;
		System.out.println("c3 unicod = "+unicode2);
		
		char c4;
		unicode2=unicode2+1;
		c4=(char)unicode2;
		System.out.println("이의 다음글자 = "+c4);
		
		
		

	}

}
