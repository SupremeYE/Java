package practice;

public class Calcul4 {
	
	//array �Ķ����
	//�迭�� ���� ���������� ������� �迭�Ķ���ͻ��
	int calculateSum(int [] numbers) {
		int i,count,sum=0;
		count = numbers.length;//�ۼ��� �迭�� ���̸�ŭ �ݺ��ϱ����� �ʱ�ȭ
		for(i=0;i<count;i++) {
			sum+=numbers[i];//�迭�� ���� ����
		}
		return sum;//���ϰ�
		
	}
}
