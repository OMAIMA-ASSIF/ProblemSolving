class Solution {
    public int maxArea(int[] heights) {

        int max_area = 0;
        int i=0;
        int j=heights.length-1;
        while(i<j){
            int area = (j - i) * Math.min(heights[i], heights[j]);
            max_area = Math.max(max_area, area);
            if (heights[i] < heights[j]){
                i++;
            }else {
                j--;
            }
        }

        return max_area;
    }
}
