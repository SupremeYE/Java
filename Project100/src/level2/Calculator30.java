package level2;

public class Calculator30 extends Calculator20{
	
	int calcutateEvenSum(int num) {
		int sum=0;
		for(int i=1;i<=num;i++) 
		{
			if(i%2==0) sum+=i;
			
		}
		return sum;
	}

}
