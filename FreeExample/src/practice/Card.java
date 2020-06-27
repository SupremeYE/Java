package practice;

public class Card {
	//필드
	int [] number; 
	String name;//나와 상대방의 이름

	//생성자 opponent(상대방/적)
	//N장의 랜덤한 Array생성
	Card(String name, int count){
		this.name=name;
		number=new int[count];
		for(int i=0;i<count;i++) {
			number[i]=(int)(Math.random()*10)+1;
		}
	}
	//출력하는 메소드 
	void cardPrint(Card opponent) {
		for(int i=0;i<number.length;i++) {
			System.out.println(number[i]+opponent.number[i]);
		}
	}
	void cardCompare(Card opponent) {
		int i;
		int mywin=0,yourwin=0;
		for(i=0;i<number.length;i++) {
			if(this.number[i]>opponent.number[i]) mywin++;
			if(this.number[i]<opponent.number[i]) yourwin++;
		}
		System.out.println(mywin+yourwin);
	}
	
}
