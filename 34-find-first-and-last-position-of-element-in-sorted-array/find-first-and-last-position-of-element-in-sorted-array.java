class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = {-1, -1};
        int n = nums.length;

        // Find the first occurrence of the target
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                arr[0] = mid;
                high = mid - 1; // Keep searching to the left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // If the target is not found, return [-1, -1]
        if (arr[0] == -1) {
            return arr;
        }

        // Find the last occurrence of the target
        low = arr[0];
        high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                arr[1] = mid;
                low = mid + 1; // Keep searching to the right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return arr;
    }
}
