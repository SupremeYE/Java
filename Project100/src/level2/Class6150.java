package level2;

public class Class6150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Region[] region = new Region[4];
		for(int i=0;i<4;i++) region[i]=new Region();
		
		System.out.println("ÃÑ ÀÎ±¸¼ö, ÃÑ ¼öÀÔ");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"Áö¿ª. \tÃÑ ÀÎ±¸¼ö:"+region[i].calculatePerson()+",\tÃÑ¼öÀÔ:"+region[i].calculateIncome()+"¸¸¿ø");
			
		}
		System.out.println("ÃÑ ÀÎ±¸¼ö, 50ÀÌ»ó ÃÑ ¼öÀÔ");
		for(int i=0;i<4;i++) {
			System.out.println((i+1)+"Áö¿ª\tÃÑÀÎ±¸¼ö:"+region[i].calculatePerson()+"\tÃÑ¼öÀÔ:"+region[i].calculateIncome50()+"¸¸¿ø");
		}

	}

}
