
public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i,sum=0,n=0;
		System.out.println("20191216 ÀÌ¿¹Àº");
		for(i=1;i<=1000;i++) {
			if(i%49==0 && i%98!=0) {
				sum+=i;
				n++;
				System.out.println(n+" th. number :"+i+". total sum :"+sum);
			}
		}
		

	}

}
