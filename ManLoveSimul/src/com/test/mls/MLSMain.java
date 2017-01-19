package com.test.mls;

import java.util.Scanner;

public class MLSMain {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		Mans man = new Mans();
		//Question q = new Question();
		//q.question();

		System.out.println("----------------------------------------------------\n\n");
		System.out.println("\t\t남자 연애 시뮬레이션(남연시) \n\n");
		System.out.println("----------------------------------------------------\n\n");

		do {

			System.out.println("1. 남자 등록");
			System.out.println("2. 게임 시작");
			System.out.print(">> ");
			int menu = input.nextInt();

			if (menu == 1) {
				System.out.println("--------------------");
				System.out.println("남자 등록을 시작합니다.");
				System.out.println("--------------------\n");
				
				System.out.print("이름 >> ");
				String name = input.nextLine();
				System.out.print("나이 >> ");
				int age = input.nextInt();
				System.out.print("주소 >> ");
				String home = input.nextLine();
				System.out.print("자기소개 >> ");
				String info = input.nextLine();
				
				
				if(man.createMan(name, age, home, info)) {
					System.out.println("남자 " + man.getLength() + "번 등록 완료!");
					System.out.println("남자 " + man.getLength() + "번의 점수 등록 시작합니다.");
					man.createScore();
				}
				
			} else if (menu == 2) {

				int choiceMan = 0;
				int choiceExam = 0;
				int scoreUser = 0;
				int[][] scoreMan = null;

				for (int i = 0; i < man.getLength(); i++) {
					System.out.println(man.getManInfo(i));
				}

				System.out.println("당신이 만나고 싶은 남자 타입은 ?");
				System.out.print(">> ");
				choiceMan = input.nextInt();

				while (choiceMan < 1 || choiceMan > 4) {
					System.out.println("\n※ 입력 범위를 초과하였습니다 ※");
					System.out.println("1 ~ 4 중 선택하세요.");
					System.out.print(">> ");
					choiceMan = input.nextInt();
				}

				//scoreMan = mans[choiceMan - 1].getScoreMan();
				/*scoreMan = man.getInfo(choiceMan - 1);

				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						System.out.println(q.getQuestion()[i][j]);
					}
					System.out.println("1 ~ 4 중 선택하세요.");
					System.out.print(">> ");
					choiceExam = input.nextInt();

					while (choiceExam < 1 || choiceExam > 4) {
						System.out.println("\n※ 입력 범위를 초과하였습니다 ※");
						System.out.println("1 ~ 4 중 선택하세요.");
						System.out.print(">> ");
						choiceExam = input.nextInt();
					}
					scoreUser += scoreMan[i][choiceExam - 1];
				}

				System.out.println("당신의 점수는 " + scoreUser + "점입니다.");*/

			}
			System.out.println("계속 하시겠습니까? (y/n)");
			System.out.print(">> ");

		} while (!input.next().equals("n"));
		System.out.print("\n\"남연시\"를 종료합니다...");
	}
}