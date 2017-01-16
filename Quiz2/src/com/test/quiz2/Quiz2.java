package com.test.quiz2;

import java.util.Scanner;

public class Quiz2 {
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		Outter: do {
			
		System.out.println("");
		System.out.println("1 ~ 4 안의 숫자를 입력하시오.");
		System.out.println("종료를 원할 시, 0을 입력하시오.");
		System.out.print(">> ");
		num = scanner.nextInt();
		
		String[][] star = new String[5][5];
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				star[i][j] = " ";
			}
		}
		
		switch(num) {
		case 0:
			break Outter;
		case 1: 
			for(int i=0; i<5; i++) {
				for(int j=0; j<=i; j++) {
					star[i][j] = "*";
				}
			}
			break;
		case 2:
			for(int i=0; i<5; i++) {
				for(int j=4-i; j<5; j++) {
					star[i][j] = "*";
				}
			}
			break;
		case 3:
			for(int i=0; i<5; i++) {
				for(int j=i; j<5; j++) {
					star[i][j] = "*";
				}
			}
			break;
		case 4:
			for(int i=0; i<5; i++) {
				for(int j=0; j<=4-i; j++) {
					star[i][j] = "*";
				}
			}
			break;
		default :
			System.out.println("입력 범위를 초과하였습니다.");
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(star[i][j]);
			}
			System.out.println("");
		}
		
		} while(num!=0);
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
