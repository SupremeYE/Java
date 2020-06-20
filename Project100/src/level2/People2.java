package level2;

public class People2 {
	
	String name;
	int age;
	//변수지정
	void setPopleInfo(String name, int age) {
		this.name=name;
		this.age=age;
		
		
	}//세팅하는 함수
	void getName() {System.out.println("name : "+this.name);}
	void getAge() {System.out.println("age : "+this.age);}
	//세팅한 정보를 불러오는것
	
}
