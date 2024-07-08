// class Solution {
//     public int[] findMissingAndRepeatedValues(int[][] grid) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int sum =0;
//         for (int i = 0; i < grid.length; i++) {
//             for (int j = 0; j < grid.length; j++) {
//                 list.add(grid[i][j]);
//                 sum+=grid[i][j];
//             }
//         }
//         Collections.sort(list);
//         int arr[]={0,0};
//         for(int i=1;i<list.size();i++){
//             if(list.get(i)==list.get(i-1)){
//                 arr[0]=list.get(i);
//                 break;
//             }
//         }
//         arr[1]=((list.size()*(list.size()+1))/2)-(sum-arr[0]);
//         return arr;

//     }
// }
import java.util.*;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int n = grid.length * grid.length;  // Total number of elements in the grid

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                list.add(grid[i][j]);
                sum += grid[i][j];
            }
        }

        Collections.sort(list);

        int[] arr = {0, 0};

        // Find the repeated number
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                arr[0] = list.get(i);
                break;
            }
        }

        // Calculate the sum of the first n natural numbers
        int totalSum = (n * (n + 1)) / 2;

        // Find the missing number
        arr[1] = totalSum - (sum - arr[0]);

        return arr;
    }
}
