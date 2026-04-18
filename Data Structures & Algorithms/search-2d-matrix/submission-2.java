class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
      

        for(int i=0;i<rows;i++){
            if(findTarget(matrix[i],target)) return true;
        }

        return false;
    }

    public boolean findTarget(int[] row,int target){
        int left = 0;
        int right = row.length-1;
        
        while(left<=right){
            int mid = (left+right)/2;
            if(row[mid]==target){
                return true;
            }else if(row[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }

        return false;

    }
}
