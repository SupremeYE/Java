import java.util.Scanner;

public class Class412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isContinue = true;
		Scanner scanner = new Scanner(System.in);
		int choice; //메뉴선택
		int speed=0; //현재속도
		int time = 0; //총경과시간
		int distance = 0; //총이동거리
		
		while(isContinue) {
			System.out.println("1. 속도증가  2.속도감속 3. 1시간(1turn)경과  4. 이동거리 5. 종료");
			System.out.println("메뉴선택");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				speed+=10;
				System.out.println("현재속도:"+speed+"km/h\n");
				break;
			case 2:
				speed-=10;
				System.out.println("현재속도:"+speed+"km/h\n");
				break;
			case 3:
				distance+=speed;
				time++;
				System.out.println("총 소요시간: "+time+"현재속도:"+speed+"총 이동거리:"+distance+'\n');
				break;
			case 4:
				System.out.println("총  이동거리:"+distance);
				break;
			case 5:
				isContinue = false;
				System.out.println("평균시속:"+distance/time);
				System.out.println("종료합니다");
				break;
				
			}
		}

	}

}
