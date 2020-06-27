package practice;

public class Calcul4 {
	
	//array 파라미터
	//배열의 수가 정해져있지 않은경우 배열파라미터사용
	int calculateSum(int [] numbers) {
		int i,count,sum=0;
		count = numbers.length;//작성한 배열의 길이만큼 반복하기위한 초기화
		for(i=0;i<count;i++) {
			sum+=numbers[i];//배열의 수를 합함
		}
		return sum;//리턴값
		
	}
}
