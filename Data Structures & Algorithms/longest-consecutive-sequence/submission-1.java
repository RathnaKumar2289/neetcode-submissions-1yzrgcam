class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        int maxSeq = 1;
        int tempSeq = 1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;

            if(nums[i]-nums[i-1]==1){
                tempSeq++;
            }else{
                maxSeq = Math.max(maxSeq,tempSeq);
                tempSeq=1;
            }
        }

        return Math.max(tempSeq,maxSeq);
    }
}
