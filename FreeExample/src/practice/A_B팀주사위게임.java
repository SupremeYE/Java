package practice;

public class A_B���ֻ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int teamAScore,teamBScore; //�� A,B�� ��������
		int teamAwin=0,teamBwin=0; //�� A,B�� �̱�Ƚ��
		boolean isContinue=true;
		
		while(isContinue) {
			teamAScore=(int)(Math.random()*6)+1;//������ �� �Ҵ�
			teamBScore=(int)(Math.random()*6)+1;
			
			if(teamAScore>teamBScore) {//�� A�� �̱���
				teamAwin++;//A���� �̱�Ƚ���� ����
				System.out.println("A : "+teamAScore+", B :"+teamBScore+". Team A "+teamAwin+" Wins!!!");
				
			}
			else if(teamAScore<teamBScore) { //�� B�� �̰��� ���
				teamBwin++;//��B�� �̱�Ƚ�� ����
				System.out.println("A : "+teamAScore+", B :"+teamBScore+". Team B "+teamBwin+" Wins!!!");
				
			}
			else//����� ���
				System.out.println("A : "+teamAScore+", B : "+teamBScore+". Draw!!");
				//A���� 5�� �̱��� ���α׷�����
				if(teamAwin==5) isContinue=false;
		}
		

	}

}
