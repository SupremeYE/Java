package practice;

public class Class기본사용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 s1= new Student1();
		Student1 s2 = new Student1();
		Student1 s3 = new Student1();
		
		System.out.println("학생이름: "+s1.name);
		System.out.println("학생이름: "+s2.name);
		System.out.println("학생이름: "+s3.name);
		
		s1.name="s1이름변경";
		s2.name="s2이름변경";
		s3.name="s3이름변경";
		
		System.out.println("학생이름: "+s1.name);
		System.out.println("학생이름: "+s2.name);
		System.out.println("학생이름: "+s3.name);
		

	}

}
