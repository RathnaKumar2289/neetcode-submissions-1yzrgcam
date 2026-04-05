class Solution {
    public int longestConsecutive(int[] nums) {
      
        int maxSeq = 0;
        
        Set<Integer> set = new HashSet<>();
        for(int value:nums){
            set.add(value);
        }

        for(int number:set){
            if(!set.contains(number-1)){
                int tempSeq = 1;
                int sequenceStart = number;
                while(set.contains(sequenceStart+1)){
                        tempSeq++;
                        sequenceStart++;
                }
                 maxSeq = Math.max(maxSeq,tempSeq);
            }
           
        }

        return maxSeq;
    }
}
