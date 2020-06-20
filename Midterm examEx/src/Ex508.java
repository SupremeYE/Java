
public class Ex508 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int studentA[] = new int[7];
		int studentB[] = new int[7];
		int studentC[] = new int[7];
		
		int i;
		for(i=0;i<7;i++) {
			studentA[i]=(int)(Math.random()*100)+1;
			studentB[i] = (int)(Math.random()*100)+1;
			if(studentA[i]>=studentB[i]) studentC[i]=studentA[i];
			if(studentA[i]<studentB[i]) studentC[i]=studentB[i];
		}
		System.out.print("학생 A 점수:");
		for (i=0;i<7;i++) {
			System.out.print(studentA[i]+"\t");
		}
		System.out.print("\n학생 B점수:");
		for(i=0;i<7;i++) {
			System.out.print(studentB[i]+"\t");
		}
		System.out.print("\n학생 C점수:");
		for(i=0;i<7;i++) {
			System.out.print(studentC[i]+"\t");
		}

	}

}
