class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        Stack<int[]> stack = new Stack<>();  // {temperature, index}
        for (int i=0; i<n; i++){
            int temp = temperatures[i];

            while(!stack.isEmpty() && temp > stack.peek()[0]) {
                int[] top = stack.pop();
                result[top[1]] = i - top[1];
            }

            stack.push(new int[]{temp, i});
        }

        return result;
    }
}
