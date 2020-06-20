
public class Class505 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length !=2) {
			System.out.println("2개 피라미터 필요");
			System.exit(0);
			
		}//args가 스트링 2개일때만 실행이된다
		
			String str1=args[0];
			String str2=args[1];
			System.out.println(str1+str2);
			
			
			int i,j;
			i=Integer.parseInt(args[0]);
			j=Integer.parseInt(args[1]);
			
			System.out.println(i+j);
			

	}

}
