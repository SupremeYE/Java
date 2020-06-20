package practice;

public class Class302 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//구구단 프로그래밍
		int i,j;
		for(i=1;i<=9;i++) {//단
			System.out.print("\n **"+i+"단==> ");
			for(j=1;j<=9;j++) {//곱해지는수
				System.out.print(i*j+"\t");
			}
		}

	}

}
