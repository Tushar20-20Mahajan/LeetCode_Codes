// Using loop 
// class Solution {
//     public int mySqrt(int x) {
//         if (x==0){
//             return 0;
//         }
//         int result = 1;
//         long mul = result*result;
//         while(mul<=x){
//              result++;
//              mul = result*result;
           
//         }
//         return result-1;
//     }
// }

class Solution {
  public int mySqrt(int x) {
    if (x == 0) {
      return 0;
    }
    long low = 0;
    long high = x;
    while (low <= high) {
      long mid = low + (high - low) / 2;
      if (mid * mid == x) { 
        return (int) mid;
      } else if (mid * mid > x) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }
    return (int) high;
  }
}
