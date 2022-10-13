package Programmers.lv01;

public class CaesarPassword {
	public static void main(String[] args) {
		CPSolution sol = new CPSolution();
	}
}

class CPSolution {
    public String solution(String s, int n) {
        String answer = caesarPassword(s, n);
        return answer;
    }
    String caesarPassword(String s, int n){
        char[] charArr = new char[s.length()];
        for(int i =0;i<s.length();i++){
            charArr[i] = charCheck(s.charAt(i), n);
        }
        String str = new String(charArr);
        return str;
    }
    char charCheck(char ch, int n) {
        char tmp;
        n %= 26;
        tmp = ch;
    	if(lowerCase(ch)){
            tmp += (char)n;
            if(!lowerCase(ch,n)) tmp -= (char)26;
        } else if(upperCase(ch)){
            tmp += (char)n;
            if(!upperCase(ch,n)) tmp -= (char)26;
        }
    	return tmp;
    }
    boolean lowerCase(char ch, int n){
        char c = (char)(n);
        if(ch+c >= 'a' && ch+c <= 'z') return true;
        return false;
    }
    boolean upperCase(char ch, int n){
        char c = (char)(n);
        if(ch+c >= 'A' && ch+c <= 'Z') return true;
        return false;
    }
    boolean lowerCase(char ch){
        return lowerCase(ch, 0);
    }
    boolean upperCase(char ch){
        return upperCase(ch, 0);
    }
}

/*

https://school.programmers.co.kr/learn/courses/30/lessons/12926

 시저 암호

문제 설명

어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.
제한 조건

    공백은 아무리 밀어도 공백입니다.
    s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
    s의 길이는 8000이하입니다.
    n은 1 이상, 25이하인 자연수입니다.

입출력 예
s 	n 	result
"AB" 	1 	"BC"
"z" 	1 	"a"
"a B z" 	4 	"e F d"

*/