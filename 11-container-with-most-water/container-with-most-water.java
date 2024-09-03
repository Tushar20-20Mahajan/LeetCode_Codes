class Solution {
    public int maxArea(int[] height) {
        //ArrayList <Integer> array = new ArrayList<>();
        int lp=0;
        int rp=height.length-1;
        int maxA=0;
       while(lp<rp){
            int width = rp-lp;
            int length = Math.min(height[lp] ,height[rp]);
            int current= length*width;
            maxA=Math.max(current,maxA);
            if (height[lp]>height[rp]){
                rp--;
            }
            else{
                lp++;
            }

        }
        return maxA;
        
    }
}