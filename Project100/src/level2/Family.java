package level2;

public class Family {

	Person[] person;
	int personNum;
	int totalIncome;
	
	Family(){
		personNum=(int)(Math.random()*4)+1;
		person=new Person[personNum];
		for (int i=0;i<personNum;i++) person[i]=new Person();
		}
	
	void calculateSum() {
	
		totalIncome=0;
		for(int i=0;i<personNum;i++) totalIncome+=person[i].income;
	}
	void displayFamilyInfo() {
		
		for(int i=0;i<personNum;i++) {
			System.out.println((i+1)+"th person. Age:"+person[i].age+" ,Income: "+person[i].income);
		}
	}
	
	
	
	
}

	
	

