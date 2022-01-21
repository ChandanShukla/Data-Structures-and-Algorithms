#include <iostream>

using namespace std;

bool isPalindrome(int x) {
    string temp = to_string(x);
    int start = 0;
    int end = temp.length() - 1;
    while(start<end){
        if(temp[start]!=temp[end]){
            return false;
        }
        start++;
        end--;
    }
    return true;
}


int main(){
    int x;
    cin>>x;
    cout<<isPalindrome(x);

}