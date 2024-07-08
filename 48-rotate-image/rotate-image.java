// (Brute Force -> Using extra space and making a new 2Darray)
// class Solution {
//     public void rotate(int[][] matrix) {
//         int arr2d[][]=new int[matrix.length][matrix.length];
//         for(int i=0;i<matrix.length;i++){
//             int k = matrix.length-1;
//             for(int j=0;j<matrix.length;j++){
//                 arr2d[i][j]=matrix[k][i];
//                 k--;
//             }
//         }
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix.length;j++){
//                 matrix[i][j]=arr2d[i][j];
//             }
//         }
//     }
// }


// Using Transpose and then reversig all the rows 
class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j =i+1;j<matrix.length;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<matrix.length;i++){
            int lp = 0;
            int rp = matrix.length-1;
            while(lp<rp){
                int temp = matrix[i][lp];
                matrix[i][lp]=matrix[i][rp];
                matrix[i][rp]=temp;
                lp++;
                rp--;
            }
        }

    }
}