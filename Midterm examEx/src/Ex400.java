
public class Ex400 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0<=Math.random()<1
		//0<=Math.random()*6<6
		//0<=(int)Math.random()*6<=5
		//1<=(int)Math.random()*6)+1<6
		int num;
		boolean isContinue =true; //����Ҳ��� yes�� �ǹ�
		while (isContinue) { //�̰��� true�� ��� �ݺ�
			num=(int)(Math.random()*6)+1;
			System.out.println("random dice is  "+num);
			if(num==3) {
				System.out.println("���α׷�����");
				isContinue=false;
			}
		}
	}

}
