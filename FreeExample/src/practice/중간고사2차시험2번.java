package practice;

import java.util.*;

public class 중간고사2차시험2번 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("20191216 이예은\n");
		int Ax, Ay, Bx, By;
		int Bwin = 0, Awin = 0;
		char matrix[][] = {{'\0','\0','\0'},{'\0','\0','\0'},{'\0','\0','\0'}};
		Random r = new Random();
		
		for(int i = 1; i<=4; ++i)
		{
			// A
			Ax = r.nextInt(3);
			Ay = r.nextInt(3);

			while(matrix[Ay][Ax] != '\0')
			{
				Ax = r.nextInt(3);
				Ay = r.nextInt(3);
			}
			matrix[Ay][Ax] = 'A';
			// B
			
			Bx = r.nextInt(3);
			By = r.nextInt(3);
			while(matrix[By][Bx] != '\0')
			{
				Bx = r.nextInt(3);
				By = r.nextInt(3);
			}
			matrix[By][Bx] = 'B';
			
			// result
			System.out.println("===========================");
			System.out.println(i+"round..");
			for(int ii = 0; ii < 3; ++ii)
			{
				for(int jj = 0; jj < 3; ++jj)
				{
					if(matrix[ii][jj] != '\0')
						System.out.print(matrix[ii][jj]+"\t");
					else
						System.out.print("-\t");
				}
				System.out.println("");
			}
			
			// 오른쪽 아래 대각선
			if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2])
			{
				if(matrix[0][0] == 'A')
					Awin = 1;
				else if(matrix[0][0] == 'B')
					Bwin = 1;
				
			}
			// 왼쪽 아래 대각선
			else if(matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0])
			{
				if(matrix[0][2] == 'A')
					Awin = 1;
				else if(matrix[0][2] == 'B')
					Bwin = 1;
			}
			for(int ii = 0; ii < 3; ++ii)
			{
				if(matrix[ii][0] == matrix[ii][1] && matrix[ii][1] == matrix[ii][2])
				{
					if(matrix[ii][0] == 'A')
						Awin = 1;
					else if(matrix[ii][0] == 'B')
						Bwin = 1;
				}
			}
			for(int ii = 0; ii < 3; ++ii)
			{
				if(matrix[0][ii] == matrix[1][ii] && matrix[1][ii] == matrix[2][ii])
				{
					if(matrix[0][ii] == 'A')
						Awin = 1;
					else if(matrix[0][ii] == 'B')
						Bwin = 1;
				}
			}
			if(Awin == 1)
			{
				System.out.println("Awin!!");
				return;
			}
			else if(Bwin == 1)
			{
				System.out.println("Bwin!!");
				return;
			}
		}
		System.out.println("Draw!!!");
	}

}