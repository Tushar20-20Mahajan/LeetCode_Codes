import java.util.ArrayList;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Collections;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int [] arr = new int[2];
        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(new AbstractMap.SimpleEntry(nums[i],i));
        }
        list.sort(Map.Entry.comparingByKey());
        int lp =0;
        int rp = nums.length-1;
        while(lp<=rp){
            if((list.get(lp).getKey()+list.get(rp).getKey())==target){
                arr[0]=list.get(lp).getValue();
                arr[1]=list.get(rp).getValue();
                break;
            }
            else if(list.get(lp).getKey()+list.get(rp).getKey()>target){
                rp--;
            }
            else if(list.get(lp).getKey()+list.get(rp).getKey()<target){
                lp++;
            }
        }

       return arr;
        
    }
}