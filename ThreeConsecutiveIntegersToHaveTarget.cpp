class Solution {
public:
    vector<long long> sumOfThree(long long num) {
        vector<long long> tab;
        if (num % 3 != 0) {
            return tab; //empty
        }
        long long i = (num - 3) / 3;
        tab.push_back(i);
        tab.push_back(i+1);
        tab.push_back(i+2);
        return tab;
       
    }
};
