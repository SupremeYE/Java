
public class Class5031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numArray[] = new int[10];
		int i;
		
		
		System.out.print("Array : ");
		
		for(i=0;i<10;i++) {
			numArray[i] = (int)(Math.random()*100)+1;
			System.out.print(numArray[i]+",");
			
		}
		int min=100;
		int max=1;
		
		for(i=0;i<10;i++) {
			if(numArray[i]<min) min=numArray[i];
			if(numArray[i]>max) max=numArray[i];
		}
		System.out.println("\n min : "+min);
		System.out.println("max : "+max);
		

	}

}
