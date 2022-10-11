package Programmers.lv01;

import java.util.*;

public class SumNDigitNumber {
	public static void main(String[] args) {
		SNDNSolution sol = new SNDNSolution();
		Random random = new Random();
		for(int i =0; i<20 ; i++) {
			int n = random.nextInt(100000000)+1;
			System.out.println(sol.solution(n));
		}
	}
}

class SNDNSolution {
    public int solution(int n) {
        int answer = 0;
        
        String str = Integer.toString(n);
        char[] charArr = str.toCharArray();
        for(int i=0;i<charArr.length;i++){
            int tmp = charArr[i] - '0';
            answer += tmp;
        }
        
        System.out.println(answer);

        return answer;
    }
}

/*
자릿수 더하기

문제 설명

자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
제한사항

   N의 범위 : 100,000,000 이하의 자연수

입출력 예
N 	answer
123 	6
987 	24
입출력 예 설명

입출력 예 #1
문제의 예시와 같습니다.

입출력 예 #2
9 + 8 + 7 = 24이므로 24를 return 하면 됩니다.
*/