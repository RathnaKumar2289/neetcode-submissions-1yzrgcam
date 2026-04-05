class Solution {
    public int trap(int[] height) {
       int waterTrapped =0;
       int leftMax = 0;
       int rightMax=0;
       int left=0;
       int right=height.length-1;

       while(left<right){
          if(height[left]<height[right]){//Process left
               if(height[left]>=leftMax){
                    leftMax = height[left];
               }else{
                    waterTrapped+=leftMax-height[left];
               }
               left++;
          }else{//Process right
               if(height[right]>=rightMax){
                    rightMax = height[right];
               }else{
                    waterTrapped+=rightMax-height[right];
               }
               right--;
          }
         
       }

       return waterTrapped;
    }
}
