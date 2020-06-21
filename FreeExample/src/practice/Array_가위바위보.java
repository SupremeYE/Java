package practice;

public class Array_가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numArray=new int[2][10];//2*10배열 할당
		int Awin=0,Bwin=0;//각각 팀 점수 초기화설정
		for(int i=0;i<2;i++) {//사람수 출력
			System.out.print((i+1)+"번째 사람. \t");
			for(int j=0;j<10;j++) {//가위바위보 랜덤설정
				//가위=1 바위=2 보=3(0)
				numArray[i][j]=(int)(Math.random()*3)+1;
				if(numArray[i][j]==1) System.out.print("가위\t");
				if(numArray[i][j]==2) System.out.print("바위\t");
				if(numArray[i][j]==3) System.out.print("보\t");
			}
			System.out.println();
		}
		System.out.print("승자판단결과. \t");
		for(int j=0;j<10;j++) {//첫번째 사람=0 두번째 사람=1 3으로 나눴을 경우로 비교함
			//0번째는 가위or보  
			if(numArray[0][j] %3==(numArray[1][j]+1)%3) { System.out.print("1번승\t");
			Awin++;}
			if(numArray[1][j] %3==(numArray[0][j]+1)%3) {System.out.print("2번승\t");
			Bwin++;}
			if(numArray[0][j]==numArray[1][j]) System.out.print("비김\t");
		}
		
		System.out.printf("\n최종결과 \t1번Win: %d,\t2번Win: %d,\t비김: %d",Awin,Bwin,(10-Awin-Bwin));

	}

}
