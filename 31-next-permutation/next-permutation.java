class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                pivot = i - 1;
                break;
            }
        }
        if(pivot==-1){
            Arrays.sort(nums);
        }else{
            for(int i=nums.length-1;i>pivot;i--){
                if(nums[i]>nums[pivot]){
                    int temp = nums[i];
                    nums[i]=nums[pivot];
                    nums[pivot]=temp;
                    break;
                }
            }
            for(int i = pivot+1;i<nums.length;i++){
                for(int j = i;j<nums.length;j++){
                    if(i!=j && nums[i]>nums[j]){
                        int temp = nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                    }
                }
            }
        }   
    }
}

// import java.util.Arrays;

// class Solution {
//     public void nextPermutation(int[] nums) {
//         int pivot = -1;
//         // Find the rightmost pivot
//         for (int i = nums.length - 1; i > 0; i--) {
//             if (nums[i] > nums[i - 1]) {
//                 pivot = i - 1;
//                 break;
//             }
//         }

//         if (pivot == -1) {
//             // If no pivot is found, sort the array to get the lowest permutation
//             Arrays.sort(nums);
//         } else {
//             // Find the rightmost successor to the pivot
//             for (int i = nums.length - 1; i > pivot; i--) {
//                 if (nums[i] > nums[pivot]) {
//                     // Swap the pivot and successor
//                     int temp = nums[i];
//                     nums[i] = nums[pivot];
//                     nums[pivot] = temp;
//                     break;
//                 }
//             }
//             // Reverse the suffix
//             reverse(nums, pivot + 1, nums.length - 1);
//         }
//     }

//     private void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;
//             start++;
//             end--;
//         }
//     }
// }
