// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int product = 1;
//         Boolean isZeroFound = false;
//         Boolean isConstantFound = false;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==0){
//                 isZeroFound = true;
//                 continue;
//             }
//             if(nums[i] != 0){
//                 isConstantFound = true;
//             }
//             product *= nums[i];
//         }

//         int arr[] = new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             if(isZeroFound){
//                 if(isConstantFound){
//                     if(nums[i] == 0){
//                     arr[i] = product;
//                    }else{
//                     arr[i] = 0;
//                    }
//                 }else{
//                     arr[i] = 0;
//                 }
                
//             }else{
//                 arr[i] = product/nums[i];
//             }
//         }
//         return arr;
//     }
// }

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Initialize all elements of the result array to 1
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }
        
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] *= leftProduct;
            leftProduct *= nums[i];
        }
        
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        
        return result;
    }
}
