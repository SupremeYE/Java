package level2;

public class Calculator5 {
	
	int calculateSum(int [] numbers) {
		int i, count, sum=0;
		count=numbers.length;
		for(i=0;i<count;i++) {
			sum+=numbers[i];
		}
		return sum;
	}

}
