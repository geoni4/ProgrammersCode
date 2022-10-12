package Programmers.lv01;

public class SumOfMatrix {
	public static void main(String[] args) {
		SOMSolution sol = new SOMSolution();
	}
}
class SOMSolution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = sumOfMatrix(arr1, arr2);
        return answer;
    }
    int[][] sumOfMatrix(int[][] mat1, int[][] mat2){
        int row, column;
        row = mat1.length;
        column = mat1[0].length;
        int[][] sum = new int[row][column];
        for(int i =0;i<row;i++){
            for(int j =0;j<column;j++){
                sum[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        return sum;
    }
}


/*

https://school.programmers.co.kr/learn/courses/30/lessons/12950
행렬의 덧셈

문제 설명

행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
제한 조건

   행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.

입출력 예
arr1 	arr2 	return
[[1,2],[2,3]] 	[[3,4],[5,6]] 	[[4,6],[7,9]]
[[1],[2]] 	[[3],[4]] 	[[4],[6]]
*/