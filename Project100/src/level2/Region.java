package level2;

public class Region {
	int familyNum;
	Family[] family;
	
	Region(){
		familyNum=(int)(Math.random()*4)+1;
		family=new Family[familyNum];
		for(int i=0;i<familyNum;i++) family[i]=new Family();
	}
	
	int calculatePerson() {
		int sum=0;
		for(int i=0;i<familyNum;i++) sum+=family[i].person.length;
		return sum;
	}
	int calculateIncome() {
		int sum=0;
		for(int i=0;i<familyNum;i++) {
			family[i].displayFamilyInfo();
			for(int j=0;j<family[i].person.length;j++)
				sum+=family[i].person[j].income;
		}
		return sum;
	}
	int calculateIncome50() {
		int sum=0;
		for (int i=0;i<familyNum;i++) {
			for(int j=0;j<family[i].person.length;j++)
				if(family[i].person[j].age>=50)
					sum+=family[i].person[j].income;
		}
		return sum;
		
	}

}
