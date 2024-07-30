class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        
        int[] arr = new int[nums.length - 1];
        int zeroCount = 0;

        // Calculate the differences between adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            arr[i] = nums[i + 1] - nums[i];
            if (arr[i] == 0) {
                zeroCount++;
            }
        }

        // If all differences are zero, the longest wiggle subsequence is just one element
        if (zeroCount == arr.length) {
            return 1;
        }

        int count = 1; // Start with a count of 1 for the first element
        int previous = 0;

        // Initialize the previous direction based on the first non-zero difference
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                previous = 1;
                count++;
                break;
            } else if (arr[i] < 0) {
                previous = -1;
                count++;
                break;
            }
        }

        // Iterate through the differences and count the wiggles
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > 0 && previous <= 0) {
                previous = 1;
                count++;
            } else if (arr[i] < 0 && previous >= 0) {
                previous = -1;
                count++;
            }
        }

        return count;
    }
}
