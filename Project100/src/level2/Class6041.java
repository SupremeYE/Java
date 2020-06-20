package level2;

public class Class6041 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("20191216 이예은");
		System.out.println("수업1");
		Class c1 = new Class("자바프로그래밍","1공531","월요일");
		Class c2 = new Class("웹프로그래밍","1공531","화요일");
		Class c3 = new Class("C++프로그래밍","1공402","수요일");
		
		System.out.println("과목명: "+c1.name);
		System.out.println("수업장소: "+c1.place);
		System.out.println("수업날짜: "+c1.date);
		System.out.println("");
		
		System.out.println("수업2");
		System.out.println("과목명: "+c2.name);
		System.out.println("수업장소: "+c2.place);
		System.out.println("수업날짜: "+c2.date);
		System.out.println("");
		
		System.out.println("수업3");
		System.out.println("과목명: "+c3.name);
		System.out.println("수업장소: "+c3.place);
		System.out.println("수업날짜: "+c3.date);
		
		
		

	}

}
