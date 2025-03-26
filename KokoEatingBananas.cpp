// 7 ms for the runtime

#include <algorithm>
#include <vector>
#include <numeric>

using namespace std;

class Solution {
public:
    // Optimized total time calculation
    long long total_time_req(vector<int>& piles, int k) {
        long long total = 0;
        for (int pile : piles) {
            total += (pile + k - 1) / k;  // Integer division to simulate ceil(pile / k)
        }
        return total;
    }

    int minEatingSpeed(vector<int>& piles, int h) {
        long long low = 1;
        long long high = *max_element(piles.begin(), piles.end());

        while (low <= high) {
            long long k = (low + high) / 2;
            long long total_time = total_time_req(piles, k);

            if (total_time <= h) {
                high = k - 1;  // Can potentially lower the speed
            } else {
                low = k + 1;   // Need a higher speed
            }
        }
        return low;  // The lowest speed that satisfies the condition
    }
};
