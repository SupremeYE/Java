package practice;

public class Card {
	//�ʵ�
	int [] number; 
	String name;//���� ������ �̸�

	//������ opponent(����/��)
	//N���� ������ Array����
	Card(String name, int count){
		this.name=name;
		number=new int[count];
		for(int i=0;i<count;i++) {
			number[i]=(int)(Math.random()*10)+1;
		}
	}
	//����ϴ� �޼ҵ� 
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
