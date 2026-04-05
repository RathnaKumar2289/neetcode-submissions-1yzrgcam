class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       if(nums.length<2) return nums;

       Map<Integer,Integer> numberCount = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        numberCount.put(nums[i],numberCount.getOrDefault(nums[i],0)+1);
       }
       
      return  numberCount.entrySet().stream().sorted((a,b)->b.getValue()-a.getValue())
       .limit(k)
       .mapToInt(Map.Entry::getKey)
       .toArray();

      
    }
}
