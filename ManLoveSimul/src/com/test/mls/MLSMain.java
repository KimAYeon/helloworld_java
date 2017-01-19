package com.test.mls;

import java.util.Scanner;

public class MLSMain {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int index = 0;
		
		Question q = null;
		Mans man = null;
		try {
			q = new Question();
			q.question();

			man = new Mans();	
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		

		System.out.println("----------------------------------------------------\n\n");
		System.out.println("\t\t남자 연애 시뮬레이션(남연시) \n\n");
		System.out.println("----------------------------------------------------\n\n");

		do {

			System.out.println();
			System.out.println("1. 남자 등록");
			System.out.println("2. 게임 시작");
			System.out.print(">> ");
			int menu = input.nextInt();

			if (menu == 1) {
				System.out.println("--------------------");
				System.out.println("남자 등록을 시작합니다.");
				System.out.println("--------------------\n");
				
				System.out.print("이름 >> ");
				String name = input.next();
				System.out.print("나이 >> ");
				int age = input.nextInt();
				System.out.print("주소 >> ");
				String home = input.next();
				System.out.print("자기소개 >> ");
				String info = input.next();
				
				index = man.createManInfo(name, age, home, info);
				System.out.println();
				System.out.println("-------- 남자 " + (index+1) + "번 정보 등록 완료! --------");
				System.out.println("남자 " + (index+1) + "번의 점수 등록 시작합니다.");
				man.createManScore(index);
				System.out.println();
				System.out.println("남자 " + (index+1) + "번 점수 등록 완료!");
				
			} else if (menu == 2) {

				int choiceMan = 0;
				int choiceExam = 0;
				int scoreUser = 0;
				int[][] scoreMan = null;

				for (int i = 0; i <=index; i++) {
					System.out.println();
					System.out.println("-------- 남자 " + (i+1)+ "번 --------");
					System.out.println("이름 : " + man.getManInfo(i).getName());
					System.out.println("나이 : " + man.getManInfo(i).getAge());
					System.out.println("사는곳 : " + man.getManInfo(i).getHome());
					System.out.println("자기소개 : " + man.getManInfo(i).getInfo());
				}

				System.out.println();
				System.out.println("당신이 만나고 싶은 남자 타입은 ?");
				System.out.print(">> ");
				choiceMan = input.nextInt();

				while (choiceMan < 1 || choiceMan > 4) {
					System.out.println("\n※ 입력 범위를 초과하였습니다 ※");
					System.out.println("1 ~ 4 중 선택하세요.");
					System.out.print(">> ");
					choiceMan = input.nextInt();
				}

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
					scoreUser += man.getScoreMan(i, choiceExam - 1);
				}

				System.out.println("당신의 점수는 " + scoreUser + "점입니다.");

			}
			System.out.println();
			System.out.println("계속 하시겠습니까? (y/n)");
			System.out.print(">> ");

		} while (!input.next().equals("n"));
		System.out.print("\n\"남연시\"를 종료합니다...");
	}
}