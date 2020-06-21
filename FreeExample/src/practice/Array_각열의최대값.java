package practice;

public class Array_각열의최대값 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numArray=new int[10][10];//2차원 배열할당 참조변수
		for(int i=0;i<10;i++) {//가로행
			for(int j=0;j<10;j++) {//세로열
				numArray[i][j]=(int)(Math.random()*100)+1;//가로세로에 랜덤수 할당
				System.out.print(numArray[i][j]+"\t");// 출력
			}
			System.out.println(" ");//줄바꿈
		}
		
		int max=0;//최대값 0으로 초기화
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				if(max<numArray[j][i]) max=numArray[j][i];//열의 값 비교
				//i값이 앞에 있으면 행마다 값이 비교됨
			}
			System.out.println((i+1)+"번째 열 최대값 : "+max);
			max=0;//다시 최대값을 초기화해서 열마다 새로운 최대값을 비교할수 있도록 함
		}
		
		

	}

}
