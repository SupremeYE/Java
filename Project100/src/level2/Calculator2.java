package level2;

public class Calculator2 {
	//�޼ҵ�
	int sum=0;
	
	int calculateSum(int n) {
		sum=0;
		int i;
		for(i=1;i<=n;i++) {
			sum+=i;
			
		}
		return sum;
	}

}
