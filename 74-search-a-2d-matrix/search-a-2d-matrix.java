class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix[0].length==1){
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][0]==target){
                    return true;
                }
            }
            return false;
        }
         if(matrix[0].length==2){
            for(int i=0;i<matrix.length;i++){
                if(matrix[i][0]==target || matrix [i][1]==target){
                    return true;
                }
            }
            return false;
        }
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