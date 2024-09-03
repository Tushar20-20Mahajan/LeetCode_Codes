// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         if(nums.length==0 || nums.length==1){
//             return false;
//         }
//         for(int i =1;i<nums.length;i++){
//             if(nums[i]==nums[i-1]){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         HashSet<Integer> list = new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             if(list.contains(nums[i])){
//                 return true;
//             }
//             list.add(nums[i]);
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> list = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(list.containsKey(nums[i]) && list.get(nums[i])>=1){
                return true;
            }
            list.put(nums[i] , list.getOrDefault(nums[i],0)+1);
        }

        return false;
    }
}