import java.util.Scanner;
public class Voo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				int A = sc.nextInt();
				int B = sc.nextInt();
				int mod = sc.nextInt();
				
				long ans = 1; 
				long multiply = A%mod;
				
				while(B>0){
					if(B%2==1){
						ans *= multiply;
						ans%=mod;
					}
					multiply = ((multiply%mod)*(multiply%mod))%mod;
					B/=2;
				}
				System.out.print(ans);
			}
		}//거듭모듈러제곱계산코드8


	


