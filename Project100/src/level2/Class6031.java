package level2;

public class Class6031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("20191216 이예은");
		System.out.println("학생1");
		
		StudentClass stu1 = new StudentClass();
		System.out.println("학과: "+stu1.department);
		System.out.println("학번: "+stu1.number);
		System.out.println("이름: "+stu1.name);
		System.out.println("나이: "+stu1.age);
		
		System.out.println("");
		
		System.out.println("학생2");
		//정보를 변경하려면
		StudentClass stu2 = new StudentClass();
		System.out.println("학과: "+stu2.department);

		/*s1.name="김자바";
		s2.name="최자바";
		s3.name="이자바";*/
		stu2.number=20152222;
		stu2.name="최자바";
		stu2.age=24;
		System.out.println("학번: "+stu2.number);
		System.out.println("이름: "+stu2.name);
		System.out.println("나이: "+stu2.age);
		
		
		System.out.println("");
		System.out.println("학생3");
		StudentClass stu3 = new StudentClass();
		System.out.println("학과: "+stu3.department);
		
		stu3.number=20163333;
		stu3.name="이자바";
		stu3.age=23;
		System.out.println("학번: "+stu3.number);
		System.out.println("이름: "+stu3.name);
		System.out.println("나이: "+stu3.age);
		
	}

}
