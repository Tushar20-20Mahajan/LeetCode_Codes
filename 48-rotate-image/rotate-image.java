// (Brute Force -> Using extra space and making a new 2Darray)
class Solution {
    public void rotate(int[][] matrix) {
        int arr2d[][]=new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            int k = matrix.length-1;
            for(int j=0;j<matrix.length;j++){
                arr2d[i][j]=matrix[k][i];
                k--;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j]=arr2d[i][j];
            }
        }
    }
}