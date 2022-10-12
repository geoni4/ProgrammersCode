package Programmers.lv01;

public class StringDescendence {
	public static void main(String[] args) {
		SDSolution sol = new SDSolution();
	}
}

class SDSolution {
    public String solution(String s) {
        String answer = sorting(s);
        return answer;
    }
    String sorting(String s){
        char[] charArr = new char[s.length()];
        String str;
        for(int i =0; i<s.length();i++){
            charArr[i] = s.charAt(i);   
        }
        for(int i =0; i<charArr.length-1;i++){
            for(int j =i+1; j<charArr.length; j++){
                if(charArr[i] < charArr[j]){
                    char tmp = charArr[i];
                    charArr[i]=charArr[j];
                    charArr[j]=tmp;
                }
            }
                
        }
        str = String.valueOf(charArr);
        return str;
    }
}


/*
https://school.programmers.co.kr/learn/courses/30/lessons/12917
 문자열 내림차순으로 배치하기

문제 설명

문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
제한 사항

    str은 길이 1 이상인 문자열입니다.

입출력 예
s 	return
"Zbcdefg" 	"gfedcbZ"
*/