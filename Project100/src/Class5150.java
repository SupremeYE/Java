
public class Class5150 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numArray = new int[2][10];
		int aWin =0,bWin =0;
		
		for(int i=0;i<2;i++) {
			System.out.print((i+1)+"��°���, \t");
			for(int j=0;j<10;j++) {
				//���� : 1 ���� :2 ��:3
				numArray[i][j]=(int)(Math.random()*3)+1;
				if(numArray[i][j]==1)System.out.print("����\t");
				if(numArray[i][j]==2)System.out.print("����\t");
				if(numArray[i][j]==3)System.out.print("��\t");
				
			}
			System.out.println();
		}
		System.out.print("�����Ǵܰ��.\t");
		for(int j=0;j<10;j++) {
			if (numArray[0][j]%3==(numArray[1][j]+1)%3) {System.out.print("1����\t"); aWin++;
		}	if (numArray[1][j]%3==(numArray[0][j]+1)%3) {System.out.print("2����\t"); aWin++;
		}	if (numArray[0][j]==numArray[1][j]) System.out.print("���\t"); 
		

		

	}
		System.out.println("\n�������. \t 1��win:"+aWin+", \t2 ��Win:"+bWin+", \t���:"+(10-aWin-bWin));
}
	
}
