package Programmerslv00;

public class Remains {
	public static void main(String[] args) {
		Solution sol = new Solution();

		System.out.println(sol.solution(10, 3));
	}
}

class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 % num2;
        return answer;
    }
}