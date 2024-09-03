class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int perfix = 1;
        int surfix = 1 ;

        for(int i = 0 ; i< nums.length;i++){
            if(perfix == 0){
                perfix =1 ;
            }
            if(surfix ==0){
                surfix = 1;
            }

            perfix *= nums[i];
            surfix *= nums[nums.length-i-1];

            max = Math.max(max , Math.max(surfix , perfix));
        }
        return max;
    }
}