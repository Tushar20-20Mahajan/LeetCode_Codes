class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0 || nums.length==1){
            return false;
        }
        for(int i =1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;
    }
}