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