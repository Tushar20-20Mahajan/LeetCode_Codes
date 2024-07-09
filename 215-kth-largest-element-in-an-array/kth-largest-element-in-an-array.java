// class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         int n = nums.length;
//         return quickSelect(nums, 0, n - 1, n - k);
//     }

//     private int quickSelect(int[] nums, int low, int high, int k) {
//         if (low == high) {
//             return nums[low];
//         }

//         int pivotIndex = partition(nums, low, high);

//         if (k == pivotIndex) {
//             return nums[k];
//         } else if (k < pivotIndex) {
//             return quickSelect(nums, low, pivotIndex - 1, k);
//         } else {
//             return quickSelect(nums, pivotIndex + 1, high, k);
//         }
//     }

//     private int partition(int[] nums, int low, int high) {
//         int pivot = nums[high];
//         int i = low-1;

//         for (int j = low; j < high; j++) {
//             if (nums[j] <= pivot) {
//                 i++;
//                 swap(nums, i, j);
//             }
//         }
//         i++;

//         swap(nums, i, high);
//         return i;
//     }

//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Create a min-heap with the first k elements.
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        // Add first k elements to the heap.
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }

        // Iterate through the remaining elements of the array.
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll(); // Remove the smallest element
                minHeap.add(nums[i]); // Add the current element
            }
        }

        // The root of the heap is the kth largest element.
        return minHeap.peek();
    }
}

