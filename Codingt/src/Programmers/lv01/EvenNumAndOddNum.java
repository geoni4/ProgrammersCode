package Programmers.lv01;

import java.util.Random;

public class EvenNumAndOddNum {
	
	public static void main(String[] args) {
		Random random = new Random();
		EAOSolution sol = new EAOSolution();
		for(int i=0;i<10;i++) {
			int a = random.nextInt();
			System.out.println(a);
			System.out.println(sol.solution(a));	
		}
	}
}

class EAOSolution{
	String solution(int num) {
		String answer = "";

		if (num % 2 == 0)
			answer = "Even";
		else
			answer = "Odd";

		return answer;
	}
}
/*
https://school.programmers.co.kr/learn/courses/30/lessons/12937
 짝수와 홀수

문제 설명

정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
제한 조건

    num은 int 범위의 정수입니다.
    0은 짝수입니다.

입출력 예
num 	return
3 	"Odd"
4 	"Even"
*/