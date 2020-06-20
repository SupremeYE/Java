import java.util.Scanner;

public class Class5200 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int AWinCount =0, BWinCount=0;
		int arrayNum;
		int round =0;
		int randomNum;
		boolean isContinue = true;
		Scanner sc=new Scanner(System.in);
		System.out.print("Matrix 크기>");
		arrayNum=sc.nextInt();
		
		int[][] numArray = new int [arrayNum][arrayNum];
		char [][] numOpen = new char[arrayNum][arrayNum];
		
		//matrix초기화
		for (int i=0;i<arrayNum;i++) {
			for(int j=0;j<arrayNum;j++) {
				numArray[i][j] = (int)(Math.random()*100)+1;
				numOpen[i][j]='-';
			}
		}
		while(isContinue) {
			//한변의 round에서의 처리내용
			System.out.println("===========================");
			System.out.println(++round+"round. A, B팀 카드를 선택합니다");
			for(int i=0;i<arrayNum;i++) {
				for(int j=0;j<arrayNum;j++) {
					System.out.print(numOpen[i][j]+"\t");
				}
				System.out.println();
			}
			//A, B 팀 카드선택...
			int x1=0,x2=0,y1=0,y2=0;
			boolean numberSelect = true;
			while (numberSelect) {
				randomNum=(int)(Math.random()*arrayNum*arrayNum);
				x1=randomNum/arrayNum; //A팀이 선택한 카드 좌표(i)
				y1=randomNum%arrayNum; //A팀이 선택한 카드 좌표(j)
				//좌표가 open되었는지 여부확인
				if((numOpen[x1][y1] !='A')&&(numOpen[x1][y1]!='B')) {
					numOpen[x1][y1]='A'; 
					System.out.print("A오픈카드 : ("+x1+","+y1+"),");
					numberSelect = false;
				}
			}
			numberSelect=true;
			while(numberSelect) {
				randomNum=(int)(Math.random()*arrayNum*arrayNum);
				x2=randomNum/arrayNum; //B팀이 선택한 카드 좌표(i)
				y2=randomNum%arrayNum; //B팀이 선택한 카드 좌표(i)
				//좌표가 open되었는지 여부확인
				if((numOpen[x2][y2] !='A')&&(numOpen[x1][y1]!='B')) {
					numOpen[x2][y2]='B'; System.out.print("B오픈카드 위치: ("+x2+","+y2+"),");
					numberSelect = false;
					
			}
		}
			//A팀 B팀 카드확인 및 승패기록
			if (numArray[x1][y1]>numArray[x2][y2]) AWinCount++;
			if (numArray[x1][y1]<numArray[x2][y2]) BWinCount++;
			System.out.println("A카드숫자 : "+numArray[x1][y1]+", B카드숫자: "+numArray[x2][y2]);
			
			System.out.println("A이긴횟수: "+AWinCount+", B이긴횟수: "+BWinCount);
			if(AWinCount==5) {
				isContinue=false;
				System.out.println("A팀 승리");
			}
			if(BWinCount==5) {
				isContinue=false;
				System.out.println("B팀 승리");
			}
			
		
	}

	}
}
