package practice;

public class �߰����3��2�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int seasonNum = 3;
		Season[] s = new Season[seasonNum];
		String[] seasonYear = { "2018", "2019", "2020" };

		for (int i = 0; i < s.length; i++) {
			s[i] = new Season();
			s[i].match();
		}

		for (int i = 0; i < s.length; i++) {
			System.out.println(seasonYear[i] + " season ==========================");
			s[i].info();
		}

	}//seoson Team Ŭ����

}
