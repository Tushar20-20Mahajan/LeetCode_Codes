class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int max = -1;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            int current = nums[i];
            int next = nums[i+1];
            if(max>next){
                return false;
            }
            if(current>max){
                max = current;
            }
        }
        return true;
        
    }
}