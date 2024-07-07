class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    list1.add(i);
                    list2.add(j);
                    
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[i].length;j++){
                if(list1.contains(i)){
                    matrix[i][j]=0;
                }
                if(list2.contains(j)){
                    matrix[i][j]=0;
                }

            }
        }

        
        
    }
}