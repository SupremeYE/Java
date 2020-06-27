package practice;

public class KumhoTire extends Tire {
	KumhoTire() { maxDistance=40; name="±ÝÈ£";}
	@Override
	int run() {
		if(maxDistance==currentDistance) {
			return 1;
		}else {
			currentDistance++;
			return 0;
		}
	}
	

}
