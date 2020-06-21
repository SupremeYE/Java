package practice;

import java.util.Scanner;

public class 성적처리Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("학생 수를 입력하세요");
		int studentnum;//학생수
		studentnum=sc.nextInt();//학생 수 입력
		
		int [] studentScore=new int[studentnum];//입력한 학생 수만큼 배열할당
		
		int i;
		for(i=0;i<studentnum;i++) {
			studentScore[i]=(int)(Math.random()*100)+1;//랜덤수 할당
			System.out.print(studentScore[i]+",");//랜덤 점수 출력
		}
		int max=0,min=100,sum=0;//최대최소합 초기값설정
		for(i=0;i<studentnum;i++) {
			if(min>studentScore[i]) min=studentScore[i];
			if(max<studentScore[i]) max=studentScore[i];
			sum+=studentScore[i];
		}
		System.out.println(" ");
		
		float average=sum/studentnum;//평균구하기
		System.out.println("max:"+max+", min:"+min+", average:"+average);
	}

}
