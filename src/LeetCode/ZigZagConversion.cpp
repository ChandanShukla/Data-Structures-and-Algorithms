#include <iostream>

using namespace std;

string convert(string s, int numRows) {
        string res = "";
        int count = 0;

        string check[numRows];
        for(int i=0;i<numRows;i++){
            check[i]="";
        }
        while(count!=s.length()){
            int track = 0;
            while(track<numRows && count<s.length()){
                check[track] += s[count];
                track++;
                count++;
            }
            track = track - 2;
            while(track>0 && count<s.length()){
                check[track] += s[count];
                track--;
                count++;
            }
        }
        for(int i=0;i<numRows;i++){
            res+=check[i];
        }
        return res;
    
}


int main(){
    cout<<"Start end"<<endl;
    cout<<convert("paypalishiring",3);
    return 0;
}
