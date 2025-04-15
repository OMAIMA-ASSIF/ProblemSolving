class Solution {
public:
    bool divideArray(vector<int>& nums) {
       
       if (nums.size() % 2 != 0) {
            return false;
        }
        
        unordered_map<int, int> freq;  //dictio dyal l frequences

        for (int num : nums) {
            freq[num]++;
        }
        
        for (const auto& pair : freq) {
            if (pair.second % 2 != 0) {
                return false;  
            }
        }
        
        return true;  
    }
};
