
public class Ex304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=10;
		x++; //후위연산자로 수식삾은 증가되지 않은 원래의 x값이고
		System.out.println("x값 : "+x);//여기서 증가된갑이 들어옴
		++x; //수식의 값은 증가된 x로 11
		System.out.println("x값: "+x);// 출력
		
		x=10;
		int y;
		y=x++;
		System.out.println("y값 : "+y);
		
		
		
		x=10;
		y=++x; 
		System.out.println("y값: "+y);
		

	}

}
