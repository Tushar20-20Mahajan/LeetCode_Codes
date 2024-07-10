class Solution {
    public boolean check(int[] nums) {
        int pivot = -1;
        int n = nums.length;
        
        // Find the pivot where the rotation could have happened
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                pivot = i + 1;
                break;
            }
        }

        // If no pivot is found, the array is already sorted
        if (pivot == -1) {
            return true;
        }

        // Check if the part after the pivot to the end is sorted
        for (int i = pivot; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        // Check if the part from the start to the pivot is sorted
        for (int i = 0; i < pivot - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }

        // Check the wrap-around condition
        return nums[n - 1] <= nums[0];
    }
}
