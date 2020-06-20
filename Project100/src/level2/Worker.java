package level2;

public class Worker extends People2{
	
	String company, position;
	
	void setWorkerInfo(String company, String posotion) {
		this.company=company;
		this.position=posotion;
	}
	void getCompany() {System.out.println("company : "+this.company);}
	void getPosition() {System.out.println("position : "+this.position);}
	

}
