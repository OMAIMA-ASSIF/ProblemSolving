class Solution {

    public String encode(List<String> strs) {
        StringBuffer encoded_string = new StringBuffer();

        for(String str : strs){
            encoded_string.append(str.length()).append("#").append(str);
        }

        return encoded_string.toString(); 
    }


    public List<String> decode(String str) {
        List<String> decoded_string = new ArrayList<>();

        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            j++;

            decoded_string.add(str.substring(j, j + len));
            i = j + len;
        }
        return decoded_string;
    }
}
