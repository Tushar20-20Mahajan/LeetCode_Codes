// import java.util.*;

// class Solution {
//     public List<List<Integer>> fourSum(int[] nums, int target) {
//         Arrays.sort(nums);
//         Set<List<Integer>> list = new HashSet<>();
        
//         if (nums.length < 4) {
//             return new ArrayList<>(list);
//         }
        
//         for (int i = 0; i < nums.length - 3; i++) {
//             for (int j = i + 1; j < nums.length - 2; j++) {
//                 int lp = j + 1;
//                 int rp = nums.length - 1;
//                 while (lp < rp) {
//                     long sum = (long)nums[lp] + (long)nums[rp] + (long)nums[i] + (long)nums[j];
//                     if (sum == target) {
//                         List<Integer> quadruplet = Arrays.asList(nums[i], nums[j], nums[lp], nums[rp]);
//                         list.add(quadruplet);
//                         lp++;
//                         rp--;
//                     } else if (sum > target) {
//                         rp--;
//                     } else {
//                         lp++;
//                     }
//                 }
//             }
//         }
//         return new ArrayList<>(list);
//     }
// }


class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        
        if (nums.length < 4) {
            return list;
        }
        
        for (int i = 0; i < nums.length - 3; i++) {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int lp = j + 1;
                int rp = nums.length - 1;
                while (lp < rp) {
                    long sum = (long)nums[lp] + (long)nums[rp] + (long)nums[i] + (long)nums[j];
                    if (sum == target) {
                        List<Integer> quadruplet = Arrays.asList(nums[i], nums[j], nums[lp], nums[rp]);
                        list.add(quadruplet);
                        while(lp<rp && nums[lp]==nums[lp+1]){
                            lp++;
                        }
                        lp++;
                         while(lp<rp && nums[rp]==nums[rp-1]){
                            rp--;
                        }
                        rp--;
                    } else if (sum > target) {
                        rp--;
                    } else {
                        lp++;
                    }
                }
            }
        }
        return list;
    }
}