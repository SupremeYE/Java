
public class Class5150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numArray = new int[2][10];
		int aWin =0,bWin =0;
		
		for(int i=0;i<2;i++) {
			System.out.print((i+1)+"번째사람, \t");
			for(int j=0;j<10;j++) {
				//가위 : 1 바위 :2 보:3
				numArray[i][j]=(int)(Math.random()*3)+1;
				if(numArray[i][j]==1)System.out.print("가위\t");
				if(numArray[i][j]==2)System.out.print("바위\t");
				if(numArray[i][j]==3)System.out.print("보\t");
				
			}
			System.out.println();
		}
		System.out.print("승자판단결과.\t");
		for(int j=0;j<10;j++) {
			if (numArray[0][j]%3==(numArray[1][j]+1)%3) {System.out.print("1번승\t"); aWin++;
		}	if (numArray[1][j]%3==(numArray[0][j]+1)%3) {System.out.print("2번승\t"); aWin++;
		}	if (numArray[0][j]==numArray[1][j]) System.out.print("비김\t"); 
		

		

	}
		System.out.println("\n최종결과. \t 1번win:"+aWin+", \t2 번Win:"+bWin+", \t비김:"+(10-aWin-bWin));
}
	
}
