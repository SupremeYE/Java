package level2;

public class Car4 {

	int speed;
	Car4() {speed=100;}
	void add(int speed) {this.speed+=speed;}
	void sub(int speed) {this.speed-=speed;}
	void print() {System.out.println("현재속도: "+speed+"km/h");}
}
