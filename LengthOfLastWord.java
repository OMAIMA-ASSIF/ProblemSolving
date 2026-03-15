class Solution {
    public int lengthOfLastWord(String s) {
        int j=0;
        int[] SizeWordsArray = new int[500];
        int tempSize =0;
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) != ' '  ) {
                tempSize++;
                if (i == s.length()-1){
                    SizeWordsArray[j++]=tempSize;
                }

            }
            else if(tempSize!=0){
                SizeWordsArray[j++]=tempSize;
                tempSize=0;
            };
            
        }
        return SizeWordsArray[j-1];
    }
}

//using Linked list

import java.util.LinkedList;
import java.util.List;

class Solution {
    public int lengthOfLastWord(String s) {
        List<Integer> sizeWordsList = new LinkedList<>();
        int tempSize = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                tempSize++;
                if (i == s.length() - 1) {
                    sizeWordsList.add(tempSize);
                }
            } else if (tempSize != 0) {
               
                sizeWordsList.add(tempSize);
                tempSize = 0;
            }
        }

        return sizeWordsList.get(sizeWordsList.size() - 1);
    }
}
