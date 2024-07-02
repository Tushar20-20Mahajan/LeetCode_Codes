
class Solution {
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trap(int height[]) { 
        // Your code here

       int n=height.length;
        
        // Left max indexes for the towers
        
        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        
        // Right max indexes for the towers
        
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        
        // Trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // Water level
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            
            // Trapped water on the tower
            trappedWater += waterLevel - height[i];
        }
        
        return trappedWater;
    } 
}