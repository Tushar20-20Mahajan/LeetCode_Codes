
class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Set<Integer> list = new HashSet<>();
        for(int i :nums){
            list.add(i);
        }
        int count = 1;
        for(int i:list){
            if(!list.contains(i-1)){
                int current = 1;
                int num = i;
                while(list.contains(num+1)){
                    current++;
                    num++;
                }
                count = Math.max(current,count);
            }
        }
        return count;
    }
}

