class Solution {
    public void nextPermutation(int[] nums) {
        int pivot = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                pivot = i - 1;
                break;
            }
        }
        if(pivot==-1){
            int lp = 0;
            int rp = nums.length-1;
            while(lp<rp){
                int temp = nums[lp];
                nums[lp]=nums[rp];
                nums[rp]=temp;
                lp++;
                rp--;
            }
        }else{
            for(int i=nums.length-1;i>pivot;i--){
                if(nums[i]>nums[pivot]){
                    int temp = nums[i];
                    nums[i]=nums[pivot];
                    nums[pivot]=temp;
                    break;
                }
            }
            // for(int i = pivot+1;i<nums.length;i++){
            //     for(int j = i;j<nums.length;j++){
            //         if(i!=j && nums[i]>nums[j]){
            //             int temp = nums[i];
            //             nums[i]=nums[j];
            //             nums[j]=temp;
            //         }
            //     }
            // }
            int lp = pivot+1;
            int rp = nums.length-1;
             while(lp<rp){
                int temp = nums[lp];
                nums[lp]=nums[rp];
                nums[rp]=temp;
                lp++;
                rp--;
            }
            
        }   
    }
}
