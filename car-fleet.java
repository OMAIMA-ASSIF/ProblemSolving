class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        
        Stack<Double> stack = new Stack<>();
        int n = speed.length;

        //descending order
        int[][] cars = new int[n][2];
        for (int i = 0; i < n; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(b[0], a[0]));

        stack.push((double)(target-cars[0][0])/cars[0][1]);
        for(int i=1; i<n ; i++){
            double time = (double)(target-cars[i][0])/cars[i][1];
            while( !stack.isEmpty() && !(time<=stack.peek())){
                stack.push(time);
            }
        }

        return stack.size();
    }
}
