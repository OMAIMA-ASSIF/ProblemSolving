class Solution {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> nums = new ArrayDeque<>(); //or Stack<Integer> nums = new Stack<>(); 

        for (String token : tokens){
            if(!(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"))){
                int n = Integer.parseInt(token);
                nums.push(n);
            } else {
                int a = nums.pop();
                int b = nums.pop();
                if(token.equals("+")) {
                    nums.push(b+a);
                }else if (token.equals("-")){
                    nums.push(b-a);
                } else if (token.equals("*")){
                    nums.push(b*a);
                } else {
                    nums.push(b/a);
                }

            }
        }
        return nums.peek();

    }
}
