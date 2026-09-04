class Solution {
    public String minWindow(String s, String t){
        HashMap<Character, Integer> freqt = new HashMap<>();
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char c : t.toCharArray()){
            freqt.put(c, freqt.getOrDefault(c, 0)+1);
        }

        int left = 0;
        int minLeft = 0; //debut de la fenetre 
        int minLengthWindow = Integer.MAX_VALUE;

        for(int right = 0; right<s.length(); right++){
            if(freqt.containsKey(s.charAt(right))){
                freq.put(s.charAt(right), freq.getOrDefault(s.charAt(right), 0)+1);
            }

            //fenetre valide ?
            while(valid(freq,freqt)){
                int windLength = right - left + 1;

                if(windLength < minLengthWindow ){
                    minLengthWindow = windLength;
                    minLeft = left;
                }

                if(freqt.containsKey(s.charAt(left))){
                    freq.put(s.charAt(left), freq.get(s.charAt(left))-1);
                }
                left++;
            }

        }
        if (minLengthWindow == Integer.MAX_VALUE) {
            return ""; 
        }

        return s.substring(minLeft,minLeft + minLengthWindow );

    }

    public boolean valid(HashMap<Character, Integer> freq, HashMap<Character, Integer> freqt){
        for (char c : freqt.keySet()){
            int required = freqt.get(c);
            int current = freq.getOrDefault(c, 0);

            if(current < required){
                return false;
            }
        }
        return true;

    }
}
