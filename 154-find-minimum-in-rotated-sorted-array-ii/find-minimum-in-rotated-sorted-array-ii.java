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
            } else if (nums[mid] < nums[high]) {
                // Otherwise, the minimum element lies in the left half
                high = mid;
            } else {
                // If nums[mid] is equal to nums[high], we can't decide the side, so reduce high
                high--;
            }
        }

        return nums[low];
    }
}
