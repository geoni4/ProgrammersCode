#include <string>
#include <vector>

using namespace std;

string caesarPassword(string s, int n);

string solution(string s, int n) {
    string answer = caesarPassword(s, n);
    return answer;
}

string caesarPassword(string s, int n){
    vector<char> charArr;
    for(int i =0; i<s.length();i++){
        char tmp;
        n %= 26;
        if(s[i] >= 'a' && s[i]<= 'z'){
            if(s[i] + n <'a' || s[i] + n >'z') tmp = s[i] + n - 26;
            else tmp = s[i]+n;
        } else if(s[i] >= 'A' && s[i] <='Z'){
            if(s[i] + n< 'A' || s[i] + n > 'Z') tmp = s[i] + n - 26;
            else tmp = s[i] + n;
        }
        else{
            tmp = s[i];
        }
        charArr.push_back(tmp);
    }
    string str(charArr.begin(), charArr.end());
    return str;
}