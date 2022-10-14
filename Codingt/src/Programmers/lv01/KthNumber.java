package Programmers.lv01;

import java.util.Arrays;

public class KthNumber {
	public static void main(String[] args) {
		KMSolution sol = new KMSolution();
	}
}

class KMSolution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = cuttedArray(array, commands);
        return answer;
    }
    int[] cuttedArray(int[] arr, int[][] commands){
        int[] cuttedArr = new int[commands.length];
        for(int i =0; i<commands.length;i++){
            cuttedArr[i] = cuttedNumber(arr, commands[i]);
        }
        return cuttedArr;
    }
    int cuttedNumber(int[] arr, int[] command){
        int[] numArr = new int[command[1]-command[0]+1];
        int last=0;
        for(int i = command[0]-1;i < command[1]; i++){
            numArr[last++] = arr[i];
        }
        Arrays.sort(numArr);
        return numArr[command[2]-1];
    }
}