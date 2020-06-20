
public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int pencils = 534;
		int student =30;
		
		//학생 한병이 가지는 연필수
		int pencilsPerStudent = pencils/student;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft=pencils%student;
		System.out.println(pencilsLeft);
	}

}
