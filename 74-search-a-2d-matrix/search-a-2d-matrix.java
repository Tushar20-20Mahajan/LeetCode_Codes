class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Use Binary Search
        for(int i=0;i<matrix.length;i++){
            int low = 0;
            int high = matrix[i].length-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(matrix[i][mid]==target){
                    return true;
                }else if(matrix[i][mid]<target){
                    low = mid+1;
                }else if(matrix[i][mid]>target){
                    high = mid -1;
                }
            }
        }
        return false;
        
    }
}