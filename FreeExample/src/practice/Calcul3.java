package practice;

public class Calcul3 {
	//������ ����
	int randomNumber(int range) {
		int num;
		num=(int)(Math.random()*range)+1;
		return num;
	}
	
	//������ �� ����				//����	//����
	void numberGernerate(int n, int range) {
		int i,trial;
		for(i=1;i<=n;i++) {
			trial=randomNumber(range);
			System.out.println(i+"��° random number : "+ trial);
		}
	}

}
