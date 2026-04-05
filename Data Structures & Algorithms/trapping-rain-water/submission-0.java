class Solution {
    public int trap(int[] height) {
        int leftMaxArr[] = new int[height.length];
        int rightMaxArr[] = new int[height.length];
        int left=0;
        int right=height.length - 1;
        leftMaxArr[0]=height[0];
       for(int i=1;i<height.length;i++){
        leftMaxArr[i] = Math.max(height[i],leftMaxArr[i-1]);
       }
        rightMaxArr[height.length-1]=height[height.length-1];
       for(int i=height.length-2;i>=0;i--){
            rightMaxArr[i]=Math.max(height[i],rightMaxArr[i+1]);
       }
        int waterTrapped= 0;
       for(int i=0;i<height.length;i++){
            waterTrapped+=Math.min(leftMaxArr[i],rightMaxArr[i])-height[i];
       }

       return waterTrapped;
    }
}
