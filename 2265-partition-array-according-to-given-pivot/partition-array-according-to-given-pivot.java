class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[] = new int[nums.length];
        int lp = 0;
        int rp = nums.length - 1;
        int count = 0;

        // First pass: Place elements less than pivot in the correct position and count the pivot elements
        for (int i : nums) {
            if (i < pivot) {
                arr[lp] = i;
                lp++;
            } else if (i == pivot) {
                count++;
            }
        }

        // Second pass: Place elements greater than pivot in the correct position
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > pivot) {
                arr[rp] = nums[i];
                rp--;
            }
        }

        // Place the pivot elements in between
        while (count > 0) {
            arr[lp] = pivot;
            lp++;
            count--;
        }

        return arr;
    }
}
