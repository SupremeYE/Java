package practice;

public class �л��ʵ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü����
		StudentClass c1 = new StudentClass();
		StudentClass c2 = new StudentClass();
		StudentClass c3 = new StudentClass();
		System.out.println("�л� 1");
		
		System.out.println("�а�: "+ c1.classname);
		System.out.println("�й�: "+c1.num);
		System.out.println("�̸�: "+c1.name);
		System.out.println("����: "+c1.age);
		
		//�ʵ尪 ����
		c2.num=20152222;
		c2.name="������";
		c2.age=24;
		System.out.println("�л� 2");
		System.out.println("�а�: "+c2.classname);
		System.out.println("�й�: "+c2.num);
		System.out.println("�̸�: "+c2.name);
		System.out.println("����: "+c2.age);
		
		
		
	}

}
