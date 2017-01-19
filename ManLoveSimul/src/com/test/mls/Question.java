package com.test.mls;

public class Question {


	// 필드
	static String[][] question;

	// 생성자
	public Question() {
		question = new String[5][];
	}



	// 메소드
	void question() {
		question[0][0] = "\nQ1. 그와 식사를 하던 도중, 그의 이에 낀 음식물을 보았다. 나는 어떻게 해야 할까? \n";
		question[0][1] = "\t1. 바로 사실을 말해 준다. \n";
		question[0][2] = "\t2. 대충 돌려서 말해 준다. \n";
		question[0][3] = "\t3. 사랑스럽게 직접 빼준다. \n";
		question[0][4] = "\t4. 무시한다. \n\n";

		question[1][0] = "\nQ2. 음식을 다 먹고 그가 계산을 했다. 이 때 나는 어떻게 행동을 할까? \n";
		question[1][1] = "\t1. \"커피는 제가 살게요\"라고 말한다. \n";
		question[1][2] = "\t2. \"잘 먹었어요\"라고 말한다. \n";
		question[1][3] = "\t3. \"계좌를 불러주세요.\"라고 말한다. \n";
		question[1][4] = "\t4. 그냥 조용히 기다린다. \n\n";

		question[2][0] = "\nQ3. 식사를 끝낸 후, 어디로 가야할까? \n";
		question[2][1] = "\t1. 이야기를 더 나눌 수 있는 카페 \n";
		question[2][2] = "\t2. 좀 더 가까워질 수 있는 술집 \n";
		question[2][3] = "\t3. 나의 매력을 보여줄 수 있는 노래방 \n";
		question[2][4] = "\t4. 그와 모든 것을 할 수 있는 그 방... \n\n";

		question[3][0] = "\nQ4. 데이트를 끝내고 집에 가야할 시간이다. 마침 집 방향이 같은데 나는 어떻게 해야할까? \n";
		question[3][1] = "\t1. \"한 잔 할래요~?\"라고 말한다. \n";
		question[3][2] = "\t2. 다음 만남을 기약하기 위해 같이 걸어간다. \n";
		question[3][3] = "\t3. 밀당을 하기 위해 약속이 있다고 그를 혼자 보낸다. \n";
		question[3][4] = "\t4. 차가 끊긴 것 같다고 거짓말을 한다. \n\n";

		question[4][0] = "\nQ5. 헤어지고 난 뒤 그에게 메세지가 왔다. 나는 어떻게 할까? \n";
		question[4][1] = "\t1. 전화를 한다. \n";
		question[4][2] = "\t2. 내일 답장을 한다. \n";
		question[4][3] = "\t3. 솔직한 나의 감정을 말한다. \n";
		question[4][4] = "\t4. 읽고 십는다. \n\n";
	}



	public String[][] getQuestion() {
		return question;
	}



	public void setQuestion(String[][] question) {
		Question.question = question;
	}
	
	public int getLength() {
		return question.length;
	}
	
}
