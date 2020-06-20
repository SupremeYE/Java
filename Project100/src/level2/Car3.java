package level2;

public class Car3 {

	String color = "black";
	int maxSpeed =100;
	
	Car3() {
		
	}
	Car3(String color){
		this.color=color;
	}
	Car3(int maxSpeed){
		this.maxSpeed=maxSpeed;
	}
	Car3(String color, int maxSpeed){
		this.color=color;
		this.maxSpeed=maxSpeed;
	}
}
