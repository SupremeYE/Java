public class Code2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isContinue = true;
		int cardA;
		int cardB;
		int AWinCount =0, BWinCount =0;
		System.out.println("20191216 ÀÌ¿¹Àº");
		while(isContinue) {
			cardA = (int)(Math.random()*5)+1;
			cardB = (int)(Math.random()*5)+1;
			
			switch(cardA) {
			case 1: 
				if(cardB==1) { System.out.println("A : "+cardA+", B : "+cardB +". Result : DRAW");
			}	if(cardB==2) { System.out.println("A : "+cardA+", B : "+cardB +". Result : B Win");BWinCount++;
			}	if(cardB==3) { System.out.println("A : "+cardA+", B : "+cardB +". Result : B Win");BWinCount++;
			}	if(cardB==4) { System.out.println("A : "+cardA+", B : "+cardB +". Result : B Win");BWinCount++;
			}	if(cardB==5) { System.out.println("A : "+cardA+", B : "+cardB +". Result : B Win");BWinCount++;
			}	
			case 2:
				if(cardB==1) { System.out.println("A : "+cardA+", B : "+cardB +". Result : A WIN");AWinCount++;
				}if(cardB==2) { System.out.println("A : "+cardA+", B : "+cardB +". Result : DRAW");
				}if(cardB==3) { System.out.println("A : "+cardA+", B : "+cardB +". Result : B Win");BWinCount++;
				}if(cardB==4) { System.out.println("A : "+cardA+", B : "+cardB +". Result : B Win");BWinCount++;
				}if(cardB==5) { System.out.println("A : "+cardA+", B : "+cardB +". Result : B Win");BWinCount++;
				}	
			case 3:
				if(cardB==1) { System.out.println("A : "+cardA+", B : "+cardB +". Result :  A WIN");AWinCount++;
				}if(cardB==2) { System.out.println("A : "+cardA+", B : "+cardB +". Result : A WIN");AWinCount++;
				}if(cardB==3) { System.out.println("A : "+cardA+", B : "+cardB +". Result :  DRAW");
				}if(cardB==4) { System.out.println("A : "+cardA+", B : "+cardB +". Result : B Win");BWinCount++;
				}if(cardB==5) { System.out.println("A : "+cardA+", B : "+cardB +". Result : B Win");BWinCount++;
				}	
			case 4:
				if(cardB==1) { System.out.println("A : "+cardA+", B : "+cardB +". Result : A WIN");AWinCount++;
				}if(cardB==2) { System.out.println("A : "+cardA+", B : "+cardB +". Result : A WIN");AWinCount++;
				}if(cardB==3) { System.out.println("A : "+cardA+", B : "+cardB +". Result : A WIN");AWinCount++;
				}if(cardB==4) { System.out.println("A : "+cardA+", B : "+cardB +". Result :  DRAW");;
				}if(cardB==5) { System.out.println("A : "+cardA+", B : "+cardB +". Result : B Win");BWinCount++;
				}	
			case 5:
				if(cardB==1) { System.out.println("A : "+cardA+", B : "+cardB +". Result : A WIN");AWinCount++;
				}if(cardB==2) { System.out.println("A : "+cardA+", B : "+cardB +". Result : A WIN");AWinCount++;
				}if(cardB==3) { System.out.println("A : "+cardA+", B : "+cardB +". Result : A WIN");AWinCount++;
				}if(cardB==4) { System.out.println("A : "+cardA+", B : "+cardB +". Result : A WIN");AWinCount++;
				}if(cardB==5) { System.out.println("A : "+cardA+", B : "+cardB +". Result :  DRAW");
				}	
				
				if ((AWinCount + BWinCount)==5) isContinue=false;
		
			}
			
		
		}
		System.out.println("AÆÀ:"+AWinCount+"wins. BÆÀ:"+BWinCount+"wins");
	}
}
	


