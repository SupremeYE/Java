
public class Class516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] numArray = new int[10][10];
		int i,j;
		System.out.println("random한 값을 할당..");
		for (i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				numArray[i][j] = (int)(Math.random()*100)+1;
				System.out.print(numArray[i][j]+"\t");
			}
			System.out.println("");
		}
		int max=0;
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				if(numArray[j][i]>max) max=numArray[j][i];
			}
			System.out.println((i+1)+"번째 열 최대값: "+max);
			max=0;//다시 초기화시켜줌 그래야 다시 루프돌때 빈값으로 가니까
			
		}
		
	}

}
