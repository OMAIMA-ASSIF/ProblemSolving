class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> recc = new HashMap<>();

        for(int num : nums){
            Integer key = new Integer(num);
            recc.put(num, recc.getOrDefault(num, 0) + 1);
        }
        
        int[] result = new int[k];

        for(int i=0; i<k; i++){
            Map.Entry<Integer, Integer> maxEntry = Collections.max(recc.entrySet(), Map.Entry.comparingByValue());
            result[i] = maxEntry.getKey();
            recc.remove(maxEntry.getKey());
        }

        return result;
    }
}
