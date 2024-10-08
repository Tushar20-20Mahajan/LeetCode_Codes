// Using Division

// class Solution {

//     public int[] productExceptSelf(int[] nums) {
//         int product = 1;
//         boolean isZeroFound = false;
//         int zeroCount = 0;
//         boolean isConstantFound = false;

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == 0) {
//                 isZeroFound = true;
//                 zeroCount++;
//                 continue;
//             }

//             if (nums[i] != 0) {
//                 isConstantFound = true;
//             }
//             product *= nums[i];
//         }

//         int[] arr = new int[nums.length];

//         if (zeroCount > 1) {
//             Arrays.fill(arr, 0);
//         } else {
//             for (int i = 0; i < nums.length; i++) {
//                 if (isZeroFound) {
//                     if (isConstantFound) {
//                         if (nums[i] == 0) {
//                             arr[i] = product;
//                         } else {
//                             arr[i] = 0;
//                         }
//                     } else {
//                         arr[i] = 0;
//                     }
//                 } else {
//                     arr[i] = product / nums[i];
//                 }
//             }
//         }

//         return arr;
//     }
// }

// Using Surfix and Prefix
// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];
//         for (int i = 0; i < n; i++) {
//             result[i] = 1;
//         }
        
//         int leftProduct = 1;
//         for (int i = 0; i < n; i++) {
//             result[i] *= leftProduct;
//             leftProduct *= nums[i];
//         }
        
//         int rightProduct = 1;
//         for (int i = n - 1; i >= 0; i--) {
//             result[i] *= rightProduct;
//             rightProduct *= nums[i];
//         }
        
//         return result;
//     }
// }


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        Arrays.fill(arr,1);
        
        int leftProduct = 1;
        for(int i=0;i<nums.length;i++){
            arr[i]*=leftProduct;
            leftProduct*=nums[i];
        }

        int rightProduct = 1 ;
         for(int i=nums.length-1 ; i>=0;i--){
            arr[i]*=rightProduct;
            rightProduct*=nums[i];
        }

        return arr;
    }
}