package com.test.mls;

import java.util.Scanner;

public class Mans extends ManInfo implements CreateMan {

	// 필드
	static Mans[] mans = new Mans[5];
	Scanner input;

	// 생성자
	public Mans() {
		super();
	}

	// 메소드
	public int createManInfo(String name, int age, String home, String info) {
		int index = 0;
		for (int i = 0; i < mans.length; i++) {
			if (mans[i] == null) {
				index = i;
				break;
			}
		}
		mans[index] = new Mans();
		mans[index].setName(name);
		mans[index].setAge(age);
		mans[index].setHome(home);
		mans[index].setInfo(info);
		
		return index;
	}

	public int createManScore(int index) {

		input = new Scanner(System.in);
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(Question.getQuestion()[i][j]);
			}
			System.out.println("5, 10, 15, 20점을 나누어 1 ~ 4번의 점수를 책정해주세요.");
			for (int k = 0; k < 4; k++) {
				System.out.print(k+1 + "번 >> ");
				int score = input.nextInt();
				mans[index].setScoreMan(i, k, score);
			}
		}

		return index;
	}

	public Mans getManInfo(int index) {
		return mans[index];
	}

	public int getLength() {
		return mans.length;
	}

}
