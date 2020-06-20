
public class Class308 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<100;i++) {
			for(int j=1;j<100;j++) {
				//System.out.println(i+","+j); 조합별로의 쌍을 볼수있음
				if((23*i+79*j)==2000) {
					System.out.println("X:"+i+"Y:"+j);
					//break;
					
				}
			}
		}

	}

}
