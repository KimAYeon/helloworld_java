package com.test.mls;

public abstract class ManInfo {
	
	//private static ManInfo singleton = new ManInfo();
	
	// 필드
	int age;
	String name, home, info;
	int[][] scoreMan;

	// 생성자
	public ManInfo() {
		age = 0;
		scoreMan = new int[5][];
		for(int i=0; i<5; i++) {
			scoreMan[i] = new int[4];
		}	
		name = home = info = null;
	}
	
	// getter, setter
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreMan(int question, int example) {
		return scoreMan[question][example];
	}

	public void setScoreMan(int question, int example, int score) {
		this.scoreMan[question][example] = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	
	// 메소드

	
}
