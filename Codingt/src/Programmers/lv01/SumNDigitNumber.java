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