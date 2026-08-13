class Solution {
    public boolean checkInclusion(String s1, String s2) {

        HashMap<Character, Integer> freq = new HashMap<>(); //the window frequency
        Map<Character, Integer> freqS1 = new HashMap<>();

        // Count characters in s1
        for (char c : s1.toCharArray()) {
            freqS1.put(c, freqS1.getOrDefault(c, 0) + 1);
        }


        int left = 0;
        int right = 0;

        while(right<s2.length()){

            freq.put(s2.charAt(right), freq.getOrDefault(s2.charAt(right) ,0)+1); 

            while( right-left+1 > s1.length()) {

                freq.put(s2.charAt(left), freq.get(s2.charAt(left))-1);
                // Remove key if frequency becomes 0
                if (freq.get(s2.charAt(left)) == 0) {
                    freq.remove(s2.charAt(left));
                }
                left++;
            }

            if(freqS1.equals(freq) && right-left+1 == s1.length()){
                return true;
            }
            
            right++;
        }

        return false;
         
    }
}
