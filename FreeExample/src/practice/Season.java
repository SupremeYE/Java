package practice;

public class Season {
	Team[] t = new Team[10];//Team 클래스 10개를 array

	String[] teamName = { "kia", "kt", "nc", "sk", "lotte", "lg", "ob", "hanhwa", "nexen", "samsung" };
	//생성자
	public Season() {
		for (int i = 0; i < t.length; i++)
			t[i] = new Team(teamName[i]);
	}
	//메소드
	void match() {
		int L_vs = 0, R_vs = 0, Round = 16;

		for (int i = 0; i < t.length; i++) {
			for (int j = i + 1; j < t.length; j++) {
				for (int k = 0; k < Round; k++) {
					L_vs = (int) (Math.random() * 10 + 1);
					R_vs = (int) (Math.random() * 10 + 1);

					if (L_vs > R_vs) {
						t[i].win++;
						t[j].lose++;
					} else if (L_vs == R_vs) {
						t[i].draw++;
						t[j].draw++;
					} else if (L_vs < R_vs) {
						t[i].lose++;
						t[j].win++;
					}
				}
			}
		}
	}
	//출력 메소드
	void info() {
		for (int i = 0; i < t.length; i++)
			System.out.printf("Team : %s.\t %d win.\t %d lose.\t %d draw.\t %d total.\n", t[i].name, t[i].win,
					t[i].lose, t[i].draw, t[i].win + t[i].draw + t[i].lose);
	}
}
