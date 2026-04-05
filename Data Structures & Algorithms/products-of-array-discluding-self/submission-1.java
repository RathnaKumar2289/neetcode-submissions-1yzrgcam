class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int result[] = new int[nums.length];
//         if(nums.length==0 || nums.length==1){
//             return result;
//         }       

//         int sumExceptZero = 1;
//         int numberOfZero =0;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0) {
//                 numberOfZero++;
//                 continue;
//             }
//             sumExceptZero=sumExceptZero*nums[i];
//         } 
        
//         if(numberOfZero>1) {
//             return result;
//         }

//         for(int index=0;index<nums.length;index++){
//          if(numberOfZero==1){
//             if(nums[index]==0){
//                 result[index]=sumExceptZero;
//                 break;
//             }
            
//         }else{
//             result[index]=sumExceptZero/nums[index];
//         }
//         }
       

// return result;
//     }

    public int[] productExceptSelf(int[] nums) {
        int result[] = new int[nums.length];
        if(nums.length<2){
            return nums;
        }

        int prefix[] = new int[nums.length];
        int suffix[] = new int[nums.length];
        prefix[0] = 1;
        suffix[nums.length-1]=1;

        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            suffix[i]=suffix[i+1]*nums[i+1];
        }

        for(int i=0;i<nums.length;i++){
            result[i]=prefix[i]*suffix[i];
        }

        return result;
    }
}  
