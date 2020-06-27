package practice;
//3차 중간고사 1번
import java.util.Scanner;

public class Family {
	Person[] p = null;
	
//person 클래스까지 중간고사 3차시험1번문제
	public static void main(String[] args) {
		// TODO Auto-generated method stub


				Scanner s = new Scanner(System.in);
				Family[] f = null;
				int num = 0;//가족 수
				int age, income, familyCount = 0;//나이, 수입,가족수세서 출력하는 변수

				System.out.print("가족 수 입력 : ");
				num = s.nextInt();//가족수 입력

				f = new Family[num];//가족수만큼 배열형성

				for (int i = 0; i < num; i++) {
					f[i] = new Family();
					System.out.printf("== Family %d ==\n", i + 1);//입력한 가족 횟수만큼 출력

					familyCount = (int) (Math.random() * 4 + 1);//한 가족은 1~4 랜덤

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
					System.out.printf("Family%d 가족수 : %d\n", i + 1, f[i].p.length);

				for (int i = 0; i < num; i++) {
					int count = 0;
					for (int j = 0; j < f[i].p.length; j++)
						if (f[i].p[j].income >= 50)
							count++;

					System.out.println("***** Family에서 수입이 50 이상인 가족수 : " + count);
				}
			}
		}

		

		
			
		

	


