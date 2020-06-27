package practice;

public class 생성자사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car2 mycar = new Car2("red",200);//값을 할당해 준다 각 파라미터로 값이 이동
		Car2 yourcar = new Car2("blue",160);
		
		System.out.println("내차 색상:"+mycar.owncolr);
		System.out.println("내 차 색상:"+mycar.maxspeed);
		System.out.println("당신차 색상:"+yourcar.owncolr);
		System.out.println("당신차 색상:"+yourcar.maxspeed);

	}

}
