package practice;

public class HankookTire extends Tire{

	HankookTire(){maxDistance=30;name="ÇÑ±¹";}
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
