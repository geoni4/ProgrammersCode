package Programmers.lv01;

public class ReverseSort {
	public static void main(String[] args) {
		RSSolution sol = new RSSolution();
	}
}
class RSSolution {
    public long solution(long n) {
        long answer = 0;
        answer = reverseSort(n);
        return answer;
    }
    
    static long reverseSort(long n){
        String str = Long.toString(n);

        int[] numArr = new int[str.length()];
        for(int i =0;i<str.length();i++){
            numArr[i] = str.charAt(i)-'0';
        }
        for(int i =0;i<numArr.length-1;i++){
            for(int j = i+1;j<numArr.length;j++){
                if(numArr[i] < numArr[j]){
                    int tmp;
                    tmp = numArr[i];
                    numArr[i] = numArr[j];
                    numArr[j] = tmp;
                }
            }
        }
        str = "";
        for(int i =0; i<numArr.length;i++)
            str += (char)(numArr[i]+'0');
        return Long.parseLong(str);
    }
}


/*
https://school.programmers.co.kr/learn/courses/30/lessons/12933
 정수 내림차순으로 배치하기

문제 설명

함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
제한 조건

    n은 1이상 8000000000 이하인 자연수입니다.

입출력 예
n 	return
118372 	873211
 */