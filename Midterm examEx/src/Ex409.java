import java.util.Scanner;

public class Ex409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("은행 잔고 관리 프로그램입니다");
		int selection;
		int temp;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		boolean isContinue = true;
		
		while(isContinue) {
			System.out.println("1. 입금  2.출금  3.잔고확인  4.종료 ");
			System.out.print("메뉴선택");
			selection=sc.nextInt();
			switch (selection) {
			case 1:
				System.out.println("월급액 입력>");
				temp=sc.nextInt();
				sum+=temp;
				System.out.println("월급: "+temp+", 총잔고:"+sum);
				break;
			case 2:
				System.out.println("출금액 입력");
				temp=sc.nextInt();
				sum-=temp;
				System.out.println("출급: "+temp+", 총잔고"+sum);
				break;
			case 3:
				System.out.println("총잔고 :"+sum);
				break;
			case 4:
				System.out.println("프로그램을 종료합니다");
				isContinue=false;
				break;
			}
			
		}

	}

}
