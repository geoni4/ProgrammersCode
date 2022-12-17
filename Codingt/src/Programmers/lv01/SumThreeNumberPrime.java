package Programmers.lv01;

public class SumThreeNumberPrime {
	public static void main(String[] args) {
		SumThreeNumberPrimeSolution sol = new SumThreeNumberPrimeSolution();
	}
}
class SumThreeNumberPrimeSolution {
    int sum=0;
    int answer=0;
    public int solution(int[] nums) {
        int[] primeNumbers;
        int max =0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] >= max) max = nums[i];
        }
        primeNumbers = new int[max*3+1];
        prime(primeNumbers);
        dfs(nums, primeNumbers, 0, 1);
        return answer;
    }
    void dfs(int[] nums, int[] primeNumbers, int start, int depth){
        if(depth>3) return;
        for(int i =start;i<nums.length;i++){
            sum += nums[i];
            if(primeNumbers[sum] == 0 & depth == 3){
                answer++;
            }
            dfs(nums, primeNumbers, i+1, depth+1);    
            sum -= nums[i];
        }
    }
    void prime(int[] primeNumbers){
        primeNumbers[0]=1; primeNumbers[1]=1;
        for(int i =0;i<primeNumbers.length;i++){
            int mult = 1;
            while(true){
                if(primeNumbers[i] == 1) break;
                mult++;
                if(primeNumbers.length <= i*mult) break;
                primeNumbers[i*mult] = 1;
            }
        }
    }
}
/*
https://school.programmers.co.kr/learn/courses/30/lessons/12977

 소수 만들기

문제 설명

주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다. 숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.
제한사항

    nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
    nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

입출력 예
nums 	result
[1,2,3,4] 	1
[1,2,7,6,4] 	4
입출력 예 설명

입출력 예 #1
[1,2,4]를 이용해서 7을 만들 수 있습니다.

입출력 예 #2
[1,2,4]를 이용해서 7을 만들 수 있습니다.
[1,4,6]을 이용해서 11을 만들 수 있습니다.
[2,4,7]을 이용해서 13을 만들 수 있습니다.
[4,6,7]을 이용해서 17을 만들 수 있습니다.




*/