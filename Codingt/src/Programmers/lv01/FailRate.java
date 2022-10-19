package Programmers.lv01;

public class FailRate {
	public static void main(String[] args) {
		FailRateSolution sol = new FailRateSolution();
		int N = 5;
		int[] stages = {2, 1, 2, 6, 4, 2};
		sol.solution(0, stages);
	}
}
class FailRateSolution {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        long[] clearedPeople = new long[N+1];
        long[] failedPeople = new long[N+1];
        long[][] challenges = new long[N+1][3];
        clearedStages(stages, clearedPeople);
        failedStages(stages, failedPeople);
        allChallenges(clearedPeople, failedPeople, challenges);
        for(int i =0; i<challenges.length;i++) {
        	for(int j =0; j<3;j++)
        		System.out.print(challenges[i][j] + " ");
        	System.out.println();
        }
        
        return answer;
    }
    void clearedStages(int[] stages, long[] clearedPeople){
        for(int i =0;i<clearedPeople.length;i++){
            for(int j =0;j<stages[i]-1;j++){
                clearedPeople[j]++;
            }
        }
    }
    void failedStages(int[] stages, long[] failedPeople){
        for(int i =0;i<failedPeople.length;i++){
            failedPeople[stages[i]-1]++;
        }
    }
    void allChallenges(long[] cp, long[] fp, long[][] chal) {
    	for(int i =0;i<cp.length;i++) {
        	chal[i][0] = cp[i]+fp[i];
        	chal[i][1] = cp[i];
        	chal[i][2] = fp[i];
    	}
    }
    //도전자 최소공배수로 만들고 비교한 다음 sort
}