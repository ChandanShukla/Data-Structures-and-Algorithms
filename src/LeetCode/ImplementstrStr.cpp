#include <iostream>

using namespace std;
int strStr(string haystack, string needle) {
    if(needle.length()==0){
            return 0;
        }
        int len = needle.length();
        for(int i=0;i<=haystack.length()-len;i++){
            if(haystack.substr(i,i+len) == (needle)){
                return i;
            }
        }
        return -1;
}
int main(){
    string haystack;
    string needle;
    cin>>haystack>>needle;
    cout<<strStr(haystack, needle)<<endl;
}