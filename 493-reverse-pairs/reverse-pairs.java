// class Solution {
//     public int reversePairs(int[] nums) {
//         int count =0;
//         for(int i=0;i<nums.length-1;i++){
//             for(int j =i+1;j<nums.length;j++){
//                 if(nums[i]>(long)2*nums[j]){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

// Using Merge sort
class Solution {
    public static int countPairs(int[] arr, int low, int mid, int high) {
        int right = mid + 1;
        int cnt = 0;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2L * arr[right]) right++;  // Use 2L to force long multiplication
            cnt += (right - (mid + 1));
        }
        return cnt;
    }

    private static void merge(int arr[], int l, int m, int r) {
        int[] merged = new int[r - l + 1];
        int idx1 = l;
        int idx2 = m + 1;
        int x = 0;
        while (idx1 <= m && idx2 <= r) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x] = arr[idx1];
                x++;
                idx1++;
            } else {
                merged[x] = arr[idx2];
                x++;
                idx2++;
            }
        }
        while (idx1 <= m) {
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }
        while (idx2 <= r) {
            merged[x] = arr[idx2];
            x++;
            idx2++;
        }
        for (int i = 0, j = l; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static int mergeSort(int arr[], int l, int r) {
        int cnt = 0;
        if (l >= r) {
            return cnt;
        }
        int mid = l + (r - l) / 2;
        cnt += mergeSort(arr, l, mid);  // left half
        cnt += mergeSort(arr, mid + 1, r); // right half
        cnt += countPairs(arr, l, mid, r); // count pairs
        merge(arr, l, mid, r);
        return cnt;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}
