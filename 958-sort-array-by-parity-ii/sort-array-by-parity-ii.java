class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int [] arr = new int[nums.length];
        int i=0;
        int j =1;
        for(int k:nums){
            if(k%2==1){
                arr[j]=k;
                j=j+2;
            }else{
                arr[i]=k;
                i=i+2;
            }
        }  
        return arr;   
    }
}