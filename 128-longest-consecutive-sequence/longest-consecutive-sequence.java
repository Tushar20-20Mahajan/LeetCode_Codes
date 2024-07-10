
// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length==0){
//             return 0;
//         }
//         Set<Integer> list = new HashSet<>();
//         for(int i :nums){
//             list.add(i);
//         }
//         int count = 1;
//         for(int i=0;i<nums.length;i++){
//             if(!list.contains(nums[i]-1)){
//                 int current = 1;
//                 int num = nums[i];
//                 while(list.contains(num+1)){
//                     current++;
//                     num++;
//                 }
//                 count = Math.max(current,count);
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int longestConsecutive(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
        
    }
}