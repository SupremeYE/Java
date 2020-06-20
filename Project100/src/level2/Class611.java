package level2;

import java.util.Scanner;

public class Class611 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Weapon Ateam = new Weapon("Ateam",100,200);
		Weapon Bteam = new Weapon("Bteam",100,200);
		boolean isContinue=true;
		Scanner sc=new Scanner(System.in);
		
		int choice;
		while (isContinue) {
			System.out.println("1.AÆÀ gun ÆÄ¿öUP 2. AÆÀ laser ÆÄ¿ö UP 3.BÆÀ gun ÆÄ¿öUP 4.BÆÀ laser ÆÄ¿ö UP  ");
			System.out.print("¼±ÅÃ>");
			choice=sc.nextInt();
			if(choice==1) Ateam.gunUP();
			if(choice==2) Ateam.laserUP();
			if(choice==3) Bteam.gunUP();
			if(choice==4) Bteam.laserUP();
			if(choice==5) isContinue=false;
			Ateam.print();
			Bteam.print();
		}
		System.out.println("ÇÁ·Î±×·¥ Á¾·á");
	}

}
