// import java.util.ArrayList;
// import java.util.AbstractMap;
// import java.util.Map;
// import java.util.Collections;
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int n=nums.length;
//         int [] arr = new int[2];
//         ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             list.add(new AbstractMap.SimpleEntry(nums[i],i));
//         }
//         list.sort(Map.Entry.comparingByKey());
//         int lp =0;
//         int rp = nums.length-1;
//         while(lp<=rp){
//             if((list.get(lp).getKey()+list.get(rp).getKey())==target){
//                 arr[0]=list.get(lp).getValue();
//                 arr[1]=list.get(rp).getValue();
//                 break;
//             }
//             else if(list.get(lp).getKey()+list.get(rp).getKey()>target){
//                 rp--;
//             }
//             else if(list.get(lp).getKey()+list.get(rp).getKey()<target){
//                 lp++;
//             }
//         }

//        return arr;
        
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] arr = new int[2];

        // Create an ArrayList of custom objects to store value and index pairs
        ArrayList<ValueIndexPair> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(new ValueIndexPair(nums[i], i));
        }

        // Sort the list based on values using a custom comparator
        Collections.sort(list, (p1, p2) -> Integer.compare(p1.value, p2.value));

        int lp = 0;
        int rp = nums.length - 1;
        while (lp <= rp) {
            int sum = list.get(lp).value + list.get(rp).value;
            if (sum == target) {
                arr[0] = list.get(lp).index;
                arr[1] = list.get(rp).index;
                break;
            } else if (sum > target) {
                rp--;
            } else {
                lp++;
            }
        }

        return arr;
    }

    // Custom class to hold value and index together
    private static class ValueIndexPair {
        int value;
        int index;

        public ValueIndexPair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
