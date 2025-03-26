#it is not the very good performance I am still working on fixing it :)
#include <algorithm> // For std::max_element
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

    int minEatingSpeed(vector<int>& piles, int h) {
         long long low = 1;
         long long high = maximum(piles);

         while (low<=high){
            long long  k =  (high+low)/2;

            long long total_time_req=0;
            for (int i =0;i<piles.size(); i++){
                total_time_req += ceil((double)piles[i]/(double)k);
            }
            if (total_time_req <= h){
                high = k - 1;
            }else{
                low = k + 1;
            }
         }
         return low;

    }
};
