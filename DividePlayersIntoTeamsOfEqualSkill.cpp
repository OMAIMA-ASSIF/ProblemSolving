#include <vector>
#include <algorithm>
using namespace std;

class Solution {
public:
    long long dividePlayers(vector<int>& skill) {
        sort(skill.begin(), skill.end());
        
        int n = skill.size();
        long long chemistrySum = 0;

        for (int i = 0; i < skill.size() / 2; ++i) {
            if (skill[i] + skill[n - i - 1] != skill[0] + skill[n - 1]) {
                return -1;  
            }
            chemistrySum += (long long)skill[i] * skill[n - i - 1]; 
        }

        return chemistrySum;  
    }
};
