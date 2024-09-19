
// class Solution
// {
//     public int majorityElement(int a[])
//     {
//         // your code here
//         int size = a.length;
//         int count =0;
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=0;i<size;i++){
//             list.add(a[i]);
//         }
//         for(int i=0;i<size;i++){
//             if(Collections.frequency(list,a[i])>(size/2)){
//                 return a[i];
//             }
//         }
        
//         return -1;
//     }
// }

class Solution {
    public int majorityElement(int[] nums) {
        // Phase 1: Find a candidate for the majority element
        int candidate = nums[0];
        int count = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    candidate = nums[i];
                    count = 1;
                }
            }
        }
        
        // Phase 2: Verify that the candidate is indeed the majority element
        count = 0;
        // for (int num : nums) {
        //     if (num == candidate) {
        //         count++;
        //     }
        // }
        
        // if (count > nums.length / 2) {
        //     return candidate;
        // } else {
        //     return -1; // Should never be reached if majority element is guaranteed
        // }
        return candidate;
    }
}
