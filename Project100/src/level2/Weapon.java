package level2;

public class Weapon {

	String name;
	int gunPower;
	int laserPower;
	
	Weapon(String name, int gunPower, int laserPower){
		this.name=name;
		this.gunPower=gunPower;
		this.laserPower=laserPower;
		
		
	}
	void gunUP() {gunPower+=10;}
	void laserUP() {laserPower+=20;}
	void print() {
		System.out.println("¿Ã∏ß:"+name+", gumPower:"+gunPower+", laserPoser:"+laserPower);
		
	}
}
