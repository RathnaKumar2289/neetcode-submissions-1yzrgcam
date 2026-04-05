class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap();

        for(int value:nums){
            if(countMap.containsKey(value)){
                return true;
            }
            countMap.put(value,1);
        }
        return false;
    }
}