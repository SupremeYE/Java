package level2;

public class Calculator1 {

	int add(int x, int y) {
		return x+y;
	}
	int sub(int x, int y) {
		return x-y;
	}
	int mul(int x, int y) {
		return x*y;
	}
	int div(int x, int y) {
		return x/y;
	}
	void calOn() {
		System.out.println("계산기를 power on 합니다");
	}
	void calOff() {
		System.out.println("계산기를 power off합니다");
	}
}
