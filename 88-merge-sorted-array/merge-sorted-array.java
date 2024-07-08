// // Brute Force
// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         int k = 0;
//         for(int i=m ;i<m+n;i++){
//             nums1[i] = nums2[k];
//             k++;
//         }
//         Arrays.sort(nums1);
        
//     }
// }

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int i = m+n-1;
        while(p2>=0){
            if(p1>=0 && nums1[p1]>nums2[p2]){
                nums1[i]=nums1[p1];
                i--;
                p1--;
            }else{
                nums1[i]=nums2[p2];
                i--;
                p2--;
            }
        }

    }
}