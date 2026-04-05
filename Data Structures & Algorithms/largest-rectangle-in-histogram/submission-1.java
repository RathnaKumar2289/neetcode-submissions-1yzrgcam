class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        for(int i=0;i<=n;i++){
            int currHeight = (i==n)?0:heights[i];

            while(!stack.isEmpty()&&currHeight<heights[stack.peek()]){
                int h = heights[stack.pop()];
                int right = i;
                int left = stack.isEmpty()?-1:stack.peek();
                int w = right-left-1;
                int area = w*h;
                maxArea = Math.max(area,maxArea);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
