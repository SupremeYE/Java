package practice;

public class FirstExamTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Acard,Bcard;
		int Awin=0,Bwin=0;
		boolean isContinue=true;
		
		for(int i=0;i<3;i++) {
			
		}
		while(isContinue) {
			Acard=(int)(Math.random()*5)+1;
			Bcard=(int)(Math.random()*5)+1;
			
			System.out.print("A : "+Acard+", B : "+Bcard);
			if(Acard>Bcard) {
				Awin++;
				System.out.println(". Result : Awin");
				
			}
			else if(Acard<Bcard){
				Bwin++;
				System.out.println(". Result : Bwin");
			}
			else {
				System.out.println(". Result : DRAW");
			}
			
		}
		
			
		}

	}


