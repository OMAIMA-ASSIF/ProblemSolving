class Solution {
    public int largestRectangleArea(int[] heights) {
        
        Stack<int[]> stack = new Stack<>();
        int n = heights.length;

        int max_area = 0;
        int indexRect = 0;
        int topArea ;

        for (int i =0; i<n; i++){
            indexRect = i; //index of the rectangle start :)
            while(!stack.isEmpty() && stack.peek()[0] > heights[i]){
                topArea =(i - stack.peek()[1])*stack.peek()[0] ;
                max_area =Math.max(topArea, max_area) ;
                
                indexRect= stack.peek()[1];
                stack.pop();
            }

            stack.push(new int[]{heights[i], indexRect});
        }

        while(!stack.isEmpty()){
            topArea =(n - stack.peek()[1])*stack.peek()[0] ;
            max_area =Math.max(topArea, max_area) ;
            stack.pop();
        }

        return max_area;
        
    }
}
