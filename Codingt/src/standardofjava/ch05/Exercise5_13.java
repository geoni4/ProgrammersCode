package standardofjava.ch05;

import java.util.Scanner;

class Exercise5_13 {
	public static void main(String[] args) {
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0;i < words.length;i++) {
			char[] question = words[i].toCharArray(); //String을 char[]로 변환
				
			for(int j = 0;j<words[i].length();j++) {
				int tmp1 = (int) (Math.random() * words[i].length());
				int tmp2 = (int) (Math.random() * words[i].length());
				
				char tmp;
				
				tmp = question[tmp1];
				
				question[tmp1] = question[tmp2];
				
				question[tmp2] = tmp;
			}
			
			System.out.printf("Q%d. %s의 정답을 입력하세요.>", i+1, new String(question));
			String answer = scanner.nextLine();
			
			// trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			if(words[i].equals(answer.trim()))
				System.out.printf("맞았습니다.%n%n");
			else
				System.out.printf("틀렸습니다.%n%n");
		}
	}// main의 끝
}
// class