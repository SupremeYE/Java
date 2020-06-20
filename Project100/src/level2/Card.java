package level2;

public class Card {
	
	int[] numbers;
	String name;
	Card(String name, int count){
		this.name=name;
		numbers=new int[count];
		
		int i;
		for(i=0;i<count;i++) {
			numbers[i]=(int)(Math.random()*10)+1;
		}
	}
	void cardInfo(Card opponent) {
		int i;
		for(i=0;i<numbers.length;i++) {
			System.out.println(numbers[i] +","+ opponent.numbers[i]);
		}
	}
	void cardCompare(Card opponent) {
		int i;
		int myWinCount=0, yourWinCount=0;
		for(i=0;i<numbers.length;i++) {
			if(numbers[i]>opponent.numbers[i] )myWinCount++;
			if(numbers[i]<opponent.numbers[i] )yourWinCount++;
		}
		System.out.println(myWinCount+","+yourWinCount);
		
	}

}

