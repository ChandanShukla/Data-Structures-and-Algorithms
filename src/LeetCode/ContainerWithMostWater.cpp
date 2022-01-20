#include <iostream>
#include <vector>

using namespace std;
int maxArea(vector<int>& height) {
    int start = 0;
        int end = height.size()-1;
        int j = 0;
        int res = 0;
        if(height.size()==1){
            return 0;
        }
        if(height.size()==2){
            return min(height[start],height[end]);
        }
        while(start!=end){

            int area = min(height[start],height[end])*(end-start);
            res = max(area,res);
            if(height[start]<height[end]){
                start++;
            }else{
                end--;
            }
            j++;
        }
        return res;
}
int main(){
    int arr[] = {2,3,4,5,18,17,6};
    vector<int> height(arr,arr+7);
    cout<<maxArea(height);
    return 0;

}