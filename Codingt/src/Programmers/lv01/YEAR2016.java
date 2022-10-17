package Programmers.lv01;

import java.util.Locale;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Calendar;

public class YEAR2016 {
	public static void main(String[] args) {
		YEAR2016Solution sol = new YEAR2016Solution();
	}
}
class YEAR2016Solution {
    public String solution(int a, int b) {
        Calendar cal = Calendar.getInstance();
		LocalDate date2016 = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date2016.getDayOfWeek();
        String answer = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase();
        return answer;
    }
}

/*
https://school.programmers.co.kr/learn/courses/30/lessons/12901

 2016년

문제 설명

2016년 1월 1일은 금요일입니다. 2016년 a월 b일은 무슨 요일일까요? 두 수 a ,b를 입력받아 2016년 a월 b일이 무슨 요일인지 리턴하는 함수, solution을 완성하세요. 요일의 이름은 일요일부터 토요일까지 각각 SUN,MON,TUE,WED,THU,FRI,SAT

입니다. 예를 들어 a=5, b=24라면 5월 24일은 화요일이므로 문자열 "TUE"를 반환하세요.
제한 조건

    2016년은 윤년입니다.
    2016년 a월 b일은 실제로 있는 날입니다. (13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다)

입출력 예
a 	b 	result
5 	24 	"TUE"

*/