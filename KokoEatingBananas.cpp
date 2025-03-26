// 11 ms for the runtime
#include <algorithm> 
using namespace std;

class Solution {
public:

    long long maximum(vector<int>& t){
        long long max=t[0];
        for (int i=1; i<t.size(); i++){
            if(t[i]>max){
                max=t[i];
            }
        }
        return max;
    }
    long long total_time_req(vector<int>& piles, int k){
        long long total=0;
        for (int i =0;i<piles.size(); i++){
                total += ceil((double)piles[i]/(double)k);
            }
        return total;
    }

    int minEatingSpeed(vector<int>& piles, int h) {
         long long low = 1;
         long long high = maximum(piles);

         while (low<=high){
            long long  k =  (high+low)/2;

            long long total_time = total_time_req(piles, k);
            
            (total_time <= h)? high = k-1 : low= k+1;
            
         }
         return low;

    }
};
