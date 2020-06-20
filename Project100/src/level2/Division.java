package level2;

public class Division {

	Student[] students;
	int mathAverage=0,engAverage=0;
	int studentCount;
	
	Division (int studentCount){
		this.studentCount=studentCount;
		students=new Student[studentCount];
		int i;
		for(i=0;i<studentCount;i++) {
			students[i]=new Student();
			students[i].setEngScore((int)(Math.random()*100+1));
			students[i].setMathScore((int)(Math.random()*100+1));
		}
		
	}
	int calAverage() {
		int i;
		
		for(i=0;i<studentCount;i++) {
			mathAverage+=students[i].getMathScore();
			engAverage+=students[i].getEngScore();
		}
		mathAverage/=studentCount;
		engAverage/=studentCount;
		return (mathAverage+engAverage)/2;
		
	}
	
}
