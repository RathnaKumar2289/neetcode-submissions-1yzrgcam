class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int result[] = new int[2];
        int left=0;
        int right=numbers.length-1;
        if(numbers.length<2){
            return result;
        }
        while(left<right){
            if(left!=right && numbers[left]+numbers[right]==target){
                result[0]=left+1;
                result[1]=right+1;
                break;
            }else if(numbers[left]+numbers[right]>target){
                right--;
            }else if(numbers[left]+numbers[right]<target){
                left++;
            }
        }
        return result;
    }
}
