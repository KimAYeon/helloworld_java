package com.test.mls;

import java.util.Scanner;

public class Mans extends ManInfo {

	// 필드
	static ManInfo[] mans;
	Question question;
	Scanner input;

	// 생성자
	public Mans() {
		super();
		question = new Question();
		input = new Scanner(System.in);
		question.question();
	}

	// 메소드
	boolean createMan(String name, int age, String home, String info) {
		mans[mans.length].setName(name);
		mans[mans.length].setAge(age);
		mans[mans.length].setHome(home);
		mans[mans.length].setInfo(info);
		if (mans[mans.length].getName().equals(name)) {
			return true;
		} else {
			return false;
		}
	}

	boolean createScore() {

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.println(question.getQuestion()[i][j]);
			}
			System.out.println("5, 10, 15, 20점을 나누어 1 ~ 4번의 점수를 책정해주세요.");
			for (int k = 1; k <= question.getLength(); k++) {
				System.out.print(k + "번 >> ");
				int score = input.nextInt();
				mans[mans.length].setScoreMan(i, k, score);
			}
		}
		
		if(mans[mans.length].getScoreMan(4, question.getLength())!=0) {
			return true;
		} else {
			return false;
		}
	}
	
	public ManInfo getManInfo(int index) {
		return mans[index];
	}
	
	public int getLength() {
		return mans.length;
	}

}
