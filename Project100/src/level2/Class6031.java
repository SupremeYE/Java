package level2;

public class Class6031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("20191216 �̿���");
		System.out.println("�л�1");
		
		StudentClass stu1 = new StudentClass();
		System.out.println("�а�: "+stu1.department);
		System.out.println("�й�: "+stu1.number);
		System.out.println("�̸�: "+stu1.name);
		System.out.println("����: "+stu1.age);
		
		System.out.println("");
		
		System.out.println("�л�2");
		//������ �����Ϸ���
		StudentClass stu2 = new StudentClass();
		System.out.println("�а�: "+stu2.department);

		/*s1.name="���ڹ�";
		s2.name="���ڹ�";
		s3.name="���ڹ�";*/
		stu2.number=20152222;
		stu2.name="���ڹ�";
		stu2.age=24;
		System.out.println("�й�: "+stu2.number);
		System.out.println("�̸�: "+stu2.name);
		System.out.println("����: "+stu2.age);
		
		
		System.out.println("");
		System.out.println("�л�3");
		StudentClass stu3 = new StudentClass();
		System.out.println("�а�: "+stu3.department);
		
		stu3.number=20163333;
		stu3.name="���ڹ�";
		stu3.age=23;
		System.out.println("�й�: "+stu3.number);
		System.out.println("�̸�: "+stu3.name);
		System.out.println("����: "+stu3.age);
		
	}

}
