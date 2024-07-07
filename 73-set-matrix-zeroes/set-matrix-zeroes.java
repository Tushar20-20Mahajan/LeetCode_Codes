// class Solution {
//     public void setZeroes(int[][] matrix) {
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         for(int i=0;i<matrix.length;i++){
//             for(int j = 0;j<matrix[i].length;j++){
//                 if(matrix[i][j]==0){
//                     list1.add(i);
//                     list2.add(j);
                    
//                 }
//             }
//         }
//         for(int i=0;i<matrix.length;i++){
//             for(int j = 0;j<matrix[i].length;j++){
//                 if(list1.contains(i)){
//                     matrix[i][j]=0;
//                 }
//                 if(list2.contains(j)){
//                     matrix[i][j]=0;
//                 }

//             }
//         }

        
        
//     }
// }

class Solution {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                        col0 =0;
                    }

                }

            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j = 1;j<matrix[i].length;j++){  
                if((matrix[i][j]!=0)&&(matrix[0][j]==0 || matrix[i][0]==0)){
                    matrix[i][j]=0;
                }
            }
        }
        if(matrix[0][0]==0){
            Arrays.fill(matrix[0],0);
        }
        if(col0==0){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }

    }
}