package Programmers.lv01;

public class PrintSumTwentyLongNumbers {
	public static void main(String[] args) {
		PrintSumTwentyLongNumbersSolution sol = new PrintSumTwentyLongNumbersSolution();
		PrintSumTwentyLongNumbersUnderSevenSolution sol2 = new PrintSumTwentyLongNumbersUnderSevenSolution();
		sol.Solution();
		System.out.println("---------------------------------------------------------------------");
		sol2.Solution();
	}
}

class PrintSumTwentyLongNumbersSolution{
	public void Solution() {
		int sum=0;
		for(long n =0;n<Long.MAX_VALUE;n++) {
			if(sum>20) continue;
			if(n >=10000) break;
			long i = n;
			while(true) {
				int rem = (int)(i % 10);
				i = i / 10;
				sum += rem;
				if(sum> 20) {
					sum =0; break;
				}
				if(sum==20 && i == 0) {
					sum = 0;
					System.out.println(n);
					break;
				}
				if(i ==0) {
					sum = 0;
					break;
				}
			}
		}
	}	
}


class PrintSumTwentyLongNumbersUnderSevenSolution{
	public void Solution() {
		int sum=0;
		for(long n =0;n<Long.MAX_VALUE;n++) {
			if(sum>20) continue;
			if(n >=10000) break;
			long i = n;
			while(true) {
				int rem = (int)(i % 10);
				i = i / 10;
				sum += rem;
				if(sum> 20 || rem>6) {
					sum =0; break;
				}
				if(sum==20 && i == 0) {
					sum = 0;
					System.out.println(n);
					break;
				}
				if(i ==0) {
					sum = 0;
					break;
				}
			}
		}
	}
	
}


/*

(1) 각 자리 숫자의 합이 20인 모든 정수를 출력하세요.
        - 예1: 32,600은 3+2+6+0+0 = 11 (출력하지 않음)
        - 예2: 6,419는 6+4+1+9 = 20 (출력함)
                (2) 각 자리 숫자의 합이 20이고, 동시에 각 자리가 1, 2, 3, 4, 5, 6만으로 이루어진 모든 정수를
        출력하세요
                - 예1: 32,611은 3+2+6+1+1 = 13 (출력하지 않음)
        - 예2: 6,419는 6+4+1+9 = 20, 하지만 9가 포함되어 있음 (출력하지 않음)
                - 예3: 66,125는 6+6+1+2+5 = 20. (출력함)
                <참고 지식>
                cf 1. Java에서 사칙연산(+, -, *, /)이 지원되는 최대 타입은 long과 Long입니다.
        cf 2. Long.MAX_VALUE = 9223372036854775807 (총 19자리입니다.)
        cf. 3. 본 문제 1번의 결과는 무한합니다.

*/