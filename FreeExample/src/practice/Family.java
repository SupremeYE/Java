package practice;
//3�� �߰���� 1��
import java.util.Scanner;

public class Family {
	Person[] p = null;
	
//person Ŭ�������� �߰���� 3������1������
	public static void main(String[] args) {
		// TODO Auto-generated method stub


				Scanner s = new Scanner(System.in);
				Family[] f = null;
				int num = 0;//���� ��
				int age, income, familyCount = 0;//����, ����,���������� ����ϴ� ����

				System.out.print("���� �� �Է� : ");
				num = s.nextInt();//������ �Է�

				f = new Family[num];//��������ŭ �迭����

				for (int i = 0; i < num; i++) {
					f[i] = new Family();
					System.out.printf("== Family %d ==\n", i + 1);//�Է��� ���� Ƚ����ŭ ���

					familyCount = (int) (Math.random() * 4 + 1);//�� ������ 1~4 ����

					f[i].p = new Person[familyCount];

					for (int j = 0; j < familyCount; j++) {
						age = (int) (Math.random() * 100 + 1);
						income = (int) (Math.random() * 100 + 1);

						f[i].p[j] = new Person(age, income);

						System.out.printf("***** person %d. age : %d, income : %d\n", j + 1, f[i].p[j].age, f[i].p[j].income);
					}
				}

				System.out.println("** Summary ******************************");

				for (int i = 0; i < num; i++)
					System.out.printf("Family%d ������ : %d\n", i + 1, f[i].p.length);

				for (int i = 0; i < num; i++) {
					int count = 0;
					for (int j = 0; j < f[i].p.length; j++)
						if (f[i].p[j].income >= 50)
							count++;

					System.out.println("***** Family���� ������ 50 �̻��� ������ : " + count);
				}
			}
		}

		

		
			
		

	


