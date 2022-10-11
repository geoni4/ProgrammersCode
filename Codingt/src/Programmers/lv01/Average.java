package Programmers.lv01;

import java.util.Random;

public class Average {
	public static void main(String[] args) {
		Random random = new Random();
		AvgSolution sol = new AvgSolution();
		int length = random.nextInt(100) + 1;
		int arr[] = new int[length];
		for(int n = 0; n<10;n++) {
			for (int i = 0; i < length; i++) {
				arr[i] = random.nextInt(-10000, 10001);
			}
			double avg = sol.solution(arr);
			System.out.println(avg);
		}		
	}

}

class AvgSolution {

	public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i < arr.length; i++){
            answer += (double)arr[i];
        }
        answer /= arr.length;
        return answer;
    }
}


/*
 평균 구하기

문제 설명

정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
제한사항

    arr은 길이 1 이상, 100 이하인 배열입니다.
    arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

입출력 예
arr 	return
[1,2,3,4] 	2.5
[5,5] 	5
*/