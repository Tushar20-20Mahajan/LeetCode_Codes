class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if target is present at middle
            if (nums[mid] == target) {
                return true;
            }

            // Handle duplicates: If duplicates are found, just move the pointers closer
            if (nums[low] == nums[mid] && nums[mid] == nums[high]) {
                low++;
                high--;
            } 
            // Identify the sorted half
            else if (nums[low] <= nums[mid]) {
                // Left half is sorted
                if (target >= nums[low] && target <= nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // Right half is sorted
                if (target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return false; // Target not found
    }
}
