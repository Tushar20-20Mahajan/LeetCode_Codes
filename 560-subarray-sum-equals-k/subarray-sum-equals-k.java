class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0;
        int current = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i : nums){
            current+=i;
            res+=map.getOrDefault(current-k,0);
            map.put(current , map.getOrDefault(current,0)+1);
        }
        return res;
    }
}