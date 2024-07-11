class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target<=nums[0]){
            return 0;
        }
       
        int low = 0;
        int high = nums.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]<target){
                ans = mid+1;
                low=ans;

            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}