package practice;

public class Number {
	//static�� ����߱�Ź���
	static int number(int num) {
		return (int)(Math.random()*num)+1;
	}
	static int number(int min , int max) {
		return (int)(Math.random()*(max-min))+min;
	}
	static int number() {
		return (int)(Math.random()*100+1);
	}

}
