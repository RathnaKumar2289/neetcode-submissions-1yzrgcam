class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arrSize=nums.length;
       if( arrSize== 0) return nums;

       Map<Integer,Integer> numberCount = new HashMap<>();
       //FreqMap
       for(int i=0;i<nums.length;i++){
        numberCount.put(nums[i],numberCount.getOrDefault(nums[i],0)+1);
       }

       //Freq Bucket: Index=Frequency Value=number
       List<Integer>[] bucket=new ArrayList[arrSize+1];

       for(Map.Entry<Integer,Integer> entry:numberCount.entrySet()){
                if(bucket[entry.getValue()]==null){
                    bucket[entry.getValue()]=new ArrayList();
                }

                bucket[entry.getValue()].add(entry.getKey());
       }
        int result[] = new int[k];
        int resultIndex = 0;
       //Iterate bucket from n->1 until k result
       for(int i=bucket.length-1;i>=0&&k>0;i--){
            if(bucket[i]!=null){
                List<Integer> bucketList = bucket[i];
                for(int j=0;j<bucketList.size()&&k>0;j++){
                    result[resultIndex++]=bucketList.get(j);
                    k--;
                }
            }
       }

       return result;
      

      
    }
}