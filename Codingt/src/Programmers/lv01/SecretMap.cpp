#include <string>
#include <vector>

using namespace std;

vector<bool> reverseBinary(vector<bool> truthArr);
vector<bool> toBinary(int len, int num);
string operate(vector<bool> arr1, vector<bool> arr2);

vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    for (int i = 0; i < n; i++) {
        answer.push_back(operate(toBinary(n, arr1[i]), toBinary(n, arr2[i])));
    }
    return answer;
}

string operate(vector<bool> arr1, vector<bool> arr2) {
    char ch;
    string ret;
    for (int i = 0; i < arr1.size(); i++) {
        if (arr1[i] || arr2[i])  ch = '#';
        else ch = ' ';
        ret.push_back(ch);
    }
    return ret;
}
vector<bool> toBinary(int len, int num) {
    vector<bool> truthArr;
    while (num != 0) {
        truthArr.push_back(num % 2);
        num /= 2;
    }
    for (int i = truthArr.size(); i < len; i++) {
        truthArr.push_back(0);
    }
    truthArr = reverseBinary(truthArr);
    return truthArr;
}
vector<bool> reverseBinary(vector<bool> truthArr) {
    for (int i = 0; i < (truthArr.size() + 1) / 2; i++) {
        bool temp = truthArr[i];
        truthArr[i] = truthArr[truthArr.size() - 1 - i];
        truthArr[truthArr.size() - 1 - i] = temp;
    }
    return truthArr;
}