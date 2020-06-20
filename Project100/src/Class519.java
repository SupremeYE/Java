import java.util.Scanner;

public class Class519 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("array 크기>");
		int arrayLength = sc.nextInt();
		System.out.print("문자열 길이>");
		int strLength=sc.nextInt();
		
		char startChar='A';
		char endChar ='Z';
		int gap = (int) (endChar-startChar);
		int randNumber;
		String randStr="";
		
		String matrix[][] = new String[arrayLength][arrayLength];
		int i,j,k;
		for(i=0;i<arrayLength;i++) {
			for(j=0;j<arrayLength;j++) {
				randStr="";
				for(k=0;k<strLength;k++) {
					randNumber = (int)(Math.random()*gap)+(int)startChar;
					randStr +=(char)randNumber;
				}
				matrix[i][j] = randStr;
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("");
		}
	}

}
