
public class C111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("합이 300을 넘기 전까지의 합");
		int i=1,sum=0;
		int finalNumber=1;
		boolean isContinue = true;
		while (isContinue) {
			sum+=i;
			System.out.println(i+"th, 현재합:"+sum);
			if(sum>300) {
				isContinue=false;
				finalNumber=i-1;
			}
			i++;
			
		}
		System.out.println("마지막 숫자는"+finalNumber+"입니다");

	}//2번째 일때는 1+2 이런식으로 

}
