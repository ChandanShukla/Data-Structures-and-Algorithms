#include <iostream>

using namespace std;

int reverse(int x) {
    int res = 0;
    while(x!=0){
        int rem = x%10;
        if((res>INT_MAX/10) || res == INT_MAX/10 && rem>7){
            return 0;
        }
        if((res<INT_MIN/10) || res == INT_MIN/10 && rem<-8){
            return 0;
        }
        res = res*10 +rem;
        x = x/10;
    }
    return res;
}

int main(){
    int x;
    cin>>x;
    cout<<reverse(x);
    return 0;
}