class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       if(nums.length == 0) return nums;

       Map<Integer,Integer> numberCount = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        numberCount.put(nums[i],numberCount.getOrDefault(nums[i],0)+1);
       }

       List<Integer>[] bucket = new List[nums.length + 1];

       for(Integer key:numberCount.keySet()){
            int frequency = numberCount.get(key);
            if (bucket[frequency] == null) bucket[frequency] = new ArrayList<>();
            bucket[frequency].add(key);
       }
       
       int result[] = new int[k];
       int index=0;
       for(int j=bucket.length-1;j>=0&&index<k;j-- ){
        if(bucket[j]!=null){
            for (int val : bucket[j]) {
                if (index < k) result[index++]=val;
            }
        }
            
       }

       return result;
      

      
    }
}