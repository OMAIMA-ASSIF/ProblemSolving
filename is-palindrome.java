class Solution {
    public boolean isPalindrome(String s) {
        
        int i = 0;
        int j = s.length()-1;

        while(i<=j){
            boolean x = false;
            if(!Character.isLetterOrDigit(s.charAt(i)) && i<j){
                i++;
                x = true;
            }
            if(!Character.isLetterOrDigit(s.charAt(j)) && i<j){
                j--;
                x = true;
            }
            if (x){
                continue;
            }
            
            if ( Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(s.charAt(j))){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}
