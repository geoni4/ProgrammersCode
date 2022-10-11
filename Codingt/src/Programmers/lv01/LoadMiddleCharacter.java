package Programmers.lv01;

public class LoadMiddleCharacter {
	public static void main(String[] args) {
		LMCSolution sol = new LMCSolution();
	}
}

class LMCSolution {
    public String solution(String s) {
        String answer = middleChar(s);
        return answer;
    }
    String middleChar(String s){
        String str;
        if(s.length() % 2 == 1) str = Character.toString(s.charAt(s.length()/2));
        else str = Character.toString(s.charAt(s.length()/2-1))+Character.toString(s.charAt(s.length()/2));
        return str;
    }
}

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12903

 가운데 글자 가져오기

문제 설명

단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
재한사항

    s는 길이가 1 이상, 100이하인 스트링입니다.

입출력 예
s 	return
"abcde" 	"c"
"qwer" 	"we"
*/