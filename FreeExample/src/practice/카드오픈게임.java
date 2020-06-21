package practice;

import java.util.Scanner;

public class 카드오픈게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Awin=0, Bwin=0;//A,B팀 이긴횟수
		int arrayNum;//Matrix(배열)크기
		int round=0;//라운드횟수
		int randomNum;//랜덤한 카드위치 할당
		boolean isContinue=true;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Matrix의 크기를 설정하세요>");
		arrayNum=sc.nextInt();
		
		int [][] numArray=new int[arrayNum][arrayNum];//카드실제값
		char [][] numOpen=new char[arrayNum][arrayNum];//화면에 print되는 값
		
		//초기카드세팅
		for(int i=0;i<arrayNum;i++) {
			for(int j=0;j<arrayNum;j++) {
				numArray[i][j]=(int)(Math.random()*100)+1;
				numOpen[i][j]='-';
			}
		}//하나의 라운드
		while(isContinue) {
			//현재 카드오픈된 상태print
			//한번의 round에서의 처리내용
			System.out.println("=========================================");
			//라운드 횟수증가 하나의 라운드를 다 완성시키는 코드임
			System.out.println(++round+"round. A, B팀 카드를 선택합니다!!");
			for(int i=0;i<arrayNum;i++) {
				for(int j=0;j<arrayNum;j++) {
					System.out.print(numOpen[i][j]+"\t");//'-'값 출력
				}
				System.out.println();
			}
			//A 카드선택
			//카드위치가 결정되면 오픈 가능한지 확인하고, 가능하면 카드를 오픈하고 승부냄
			int x1=0,x2=0,y1=0,y2=0;//좌표값이 필요하니까 
			boolean numberSelect=true;//이미 오픈된 카드는 선택되지 않도록 하는 블린값
			while(numberSelect) {
				randomNum=(int)(Math.random()*arrayNum*arrayNum);//10*10=0~99사이의 값
				x1=randomNum/arrayNum;//A팀의 선택한 카드 좌표(i)
				y1=randomNum%arrayNum;//A팀의 선택한 카드 좌표(j)
				//좌표가 오픈되어있는지 여부확인
				if((numOpen[x1][y1] !='A')&&(numOpen[x1][y1]!='B')) {
					numOpen[x1][y1]='A';
					System.out.print("A오픈카드: "+"("+y1+","+x1+")");
					numberSelect=false;
				}
			}
			//B팀 카드선택
			numberSelect=true;//이미 오픈된 카드는 선택되지 않도록 하는 블린값
			while(numberSelect) {
				randomNum=(int)(Math.random()*arrayNum*arrayNum);//10*10=0~99사이의 값
				x2=randomNum/arrayNum;//B팀의 선택한 카드 좌표(i)
				y2=randomNum%arrayNum;//B팀의 선택한 카드 좌표(j)
				//좌표가 오픈되어있는지 여부확인
				if((numOpen[x2][y2] !='A')&&(numOpen[x2][y2]!='B')) {
					numOpen[x2][y2]='B';
					System.out.print(", B오픈카드: "+"("+y2+","+x2+")");
					numberSelect=false;
				}
			}
			//A,B팀 카드확인밋 승패확인
			if(numArray[x1][y1]>numArray[x2][y2]) Awin++;
			if(numArray[x1][y1]<numArray[x2][y2]) Bwin++;
			System.out.println("A카드 숫자: "+numArray[x1][y1]+"B카드숫자: "+numArray[x2][y2]);
			System.out.println("A이긴횟수: "+Awin+"B이긴횟수: "+Bwin);
			
			if(Awin==5) {
				isContinue=false;
				System.out.println("A팀이 승리!!!");
			}
			if(Bwin==5) {
				isContinue=false;
				System.out.println("B팀이 승리!!!");
			}
			
			
		}
		
	}

}
