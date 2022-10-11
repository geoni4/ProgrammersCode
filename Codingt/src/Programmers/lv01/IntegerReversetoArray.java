package Programmers.lv01;

import java.util.Random;

public class IntegerReversetoArray {
	public static void main(String[] args) {
		IRTASolution sol = new IRTASolution();
		Random random = new Random();
		long n = random.nextLong(10000000000l)+1;
		System.out.print("[");
		for(int i =0;i<sol.solution(n).length;i++) {
			System.out.print(sol.solution(n)[i]);
			if(i<sol.solution(n).length-1)
				System.out.print(",");
		}
		System.out.print("]");
	}
}


class IRTASolution {
    public int[] solution(long n) {
    	String str = Long.toString(n);
    	int[] answer = new int[str.length()];
        for(int i = 0;i<str.length();i++)
        	answer[i] = str.charAt(str.length()-1-i)-'0';
        return answer;
    }
}

/*
자연수 뒤집어 배열로 만들기

문제 설명

자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
제한 조건

   n은 10,000,000,000이하인 자연수입니다.

입출력 예
n 	return
12345 	[5,4,3,2,1]
*/