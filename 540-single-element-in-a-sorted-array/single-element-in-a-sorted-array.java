class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        // Handle edge case where there's only one element
        if (high == 0) {
            return nums[0];
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Ensure that mid is always even for pairing comparisons
            if (mid % 2 == 1) {
                mid--;
            }

            // Check if the element at mid and mid+1 are the same
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2; // Move to the right half
            } else {
                high = mid; // Move to the left half
            }
        }

        // When low meets high, it's the single element
        return nums[low];
    }
}
