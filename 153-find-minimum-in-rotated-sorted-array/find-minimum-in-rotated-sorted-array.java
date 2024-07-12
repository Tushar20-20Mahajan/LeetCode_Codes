// class Solution {
//     public int findMin(int[] nums) {
//         int target = Integer.MAX_VALUE;
//         int low = 0;
//         int high = nums.length-1;
//         while(low<=high){
//             int mid = low+(high-low)/2;
//             if(nums[mid]<target){
//                 target=nums[mid];
//             }

//             if(nums[low]<=nums[mid]){
//                 if(target>=nums[low] && target<nums[high]){
//                     high = mid-1;
//                 }else{
//                     low=mid+1;
//                 }
//             }else{
//                  if(target>=nums[mid] && target<nums[high]){
//                     low=mid+1;
//                 }else{
//                     high=mid-1;
//                 }    
//             }
//         }
//         return target;
//     }
// }

class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If the middle element is greater than the rightmost element,
            // the minimum element lies in the right half
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                // Otherwise, the minimum element lies in the left half
                high = mid;
            }
        }

        return nums[low];
    }
}
