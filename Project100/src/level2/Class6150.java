package level2;

public class Class6150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Region[] region = new Region[4];
		for(int i=0;i<4;i++) region[i]=new Region();
		
		System.out.println("�� �α���, �� ����");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"����. \t�� �α���:"+region[i].calculatePerson()+",\t�Ѽ���:"+region[i].calculateIncome()+"����");
			
		}
		System.out.println("�� �α���, 50�̻� �� ����");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"����\t���α���:"+region[i].calculatePerson()+"\t�Ѽ���:"+region[i].calculateIncome50()+"����");
		}

	}

}
