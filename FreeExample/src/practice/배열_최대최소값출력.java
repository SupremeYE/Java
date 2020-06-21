package practice;

public class 배열_최대최소값출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//잘못된코드
		/*int [] intArray = new int[10];
		int min=1,max=100;
		for(int i=1;i<=10;i++) {
			intArray[i]=(int)(Math.random()*100)+1;
			if(max<intArray[i]) {
				max=intArray[i];
			}
			else if(min>intArray[i]) {
				min=intArray[i];
			}
		
		}
		System.out.println("Min Value"+min);
		System.out.println("Max Value"+max);*/
		
		
		int numArray[]=new int[10]; //10개의 Array생성
		int i;
		int min=100, max=0;//최대 최소값 초기화 설정
		System.out.print("Array: ");
		for (i=0;i<10;i++) {
			numArray[i]=(int)(Math.random()*100)+1;//랜덤 수 할당
			System.out.print(numArray[i]+",");//출력
		}
		for(i=0;i<10;i++) {
			if(min>numArray[i]) min=numArray[i];//최소값보다 작으면 min에 할당
			if(max<numArray[i]) max=numArray[i];//최댓값보다 크면 max에 할당
		}
		System.out.println(" ");
		System.out.println("큰수: "+max);
		System.out.println("작은수: "+min);
	}

}
