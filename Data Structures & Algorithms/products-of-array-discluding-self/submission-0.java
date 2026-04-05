class Solution {
    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        if(nums.length==0 || nums.length==1){
            return result;
        }

        

        int sumExceptZero = 1;
        int numberOfZero =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) {
                numberOfZero++;
                continue;
            }
            sumExceptZero=sumExceptZero*nums[i];
        } 
        

        for(int index=0;index<nums.length;index++){
        if(numberOfZero>1) {
            return result;
        }else if(numberOfZero==1){
            if(nums[index]==0){
                result[index]=sumExceptZero;
                break;
            }
            
        }else{
            result[index]=sumExceptZero/nums[index];
        }
        }
       

return result;
    }
}  
