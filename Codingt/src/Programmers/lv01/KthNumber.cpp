#include <string>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

int cuttedNumber(vector<int> arr, vector<int> command);
vector<int> cuttedArray(vector<int> arr, vector<vector<int>> commands);
vector<int> sortArray(vector<int> arr);

vector<int> solution(vector<int> array, vector<vector<int>> commands) {
    vector<int> answer = cuttedArray(array, commands);
    return answer;
}

vector<int> cuttedArray(vector<int> arr, vector<vector<int>> commands){
    vector<int> cuttedArr;
    for(int i =0;i<commands.size();i++){
        cuttedArr.push_back(cuttedNumber(arr,commands[i]));
    }
    return cuttedArr;
}
int cuttedNumber(vector<int> arr, vector<int> command){
    vector<int> unsortedArr, sortedArr;
    for(int i = command[0]-1;i < command[1]; i++){
        unsortedArr.push_back(arr[i]);
    }
    sortedArr = sortArray(unsortedArr);
    return sortedArr[command[2]-1];
}
vector<int> sortArray(vector<int> arr){
    sort(arr.begin(), arr.end());
    return arr;
}
