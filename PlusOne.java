class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int i=n-1;
        boolean safe=false;
        while(i>=0){
            if (digits[i]!=9){
                digits[i]++;
                safe=true;
                break;
            }else{
                digits[i]=0;

            }
            i--;
        }

        if (!safe && digits[i+1]==0) {
            int[] digitsPlusOne = Arrays.copyOf(digits, digits.length + 1);
            //decalage 
            System.arraycopy(digits, 0, digitsPlusOne, 1, n);
            digitsPlusOne[0] = 1;
            return digitsPlusOne;
        }
        return digits;
 
    }
}
