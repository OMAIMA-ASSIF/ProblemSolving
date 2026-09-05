public int firstUniqChar(String s) {
    int[] freq = new int[26];
    
    // Utilisation de charAt() pour éviter la copie O(N) de toCharArray()
    for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i) - 'a']++;
    }
    
    for (int i = 0; i < s.length(); i++) {
        if (freq[s.charAt(i) - 'a'] == 1) {
            return i;
        }
    }
    return -1;
}
