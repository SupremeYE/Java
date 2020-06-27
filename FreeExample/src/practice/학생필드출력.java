package practice;

public class 학생필드출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체생성
		StudentClass c1 = new StudentClass();
		StudentClass c2 = new StudentClass();
		StudentClass c3 = new StudentClass();
		System.out.println("학생 1");
		
		System.out.println("학과: "+ c1.classname);
		System.out.println("학번: "+c1.num);
		System.out.println("이름: "+c1.name);
		System.out.println("나이: "+c1.age);
		
		//필드값 변경
		c2.num=20152222;
		c2.name="죄차바";
		c2.age=24;
		System.out.println("학생 2");
		System.out.println("학과: "+c2.classname);
		System.out.println("학번: "+c2.num);
		System.out.println("이름: "+c2.name);
		System.out.println("나이: "+c2.age);
		
		
		
	}

}
