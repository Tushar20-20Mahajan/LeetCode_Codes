// /* The isBadVersion API is defined in the parent class VersionControl.
//       boolean isBadVersion(int version); */

// public class Solution extends VersionControl {
//     public int firstBadVersion(int n) {
        

//         int low = 1;
//         int high = n;
//         int ans = 0;
//         while(low<=high){
//             int mid = low +(high-low)/2;
//             if(isBadVersion(mid) && isBadVersion(mid-1)==false){
//                 ans = mid;
//                 break;
//             }else if(isBadVersion(mid) && isBadVersion(mid-1)){
//                 high = mid-1;
//             }else{
//                 low = mid+1;
//             }
//         }
//         return ans;
//     }
// }

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                high = mid; // Potential first bad version, continue searching in the left half
            } else {
                low = mid + 1; // First bad version must be after mid
            }
        }
        
        return low; // low and high converge to the first bad version
    }
}
