
class KthLargest {
    java.util.PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    final int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
    }
    
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size()>k){
                minHeap.poll();
        }
        return minHeap.peek();
    }
}
