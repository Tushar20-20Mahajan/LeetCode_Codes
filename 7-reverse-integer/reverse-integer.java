class Solution {
    public int reverse(int x) {
        int power = 0;
        long reverse = 0;  // Use long to handle potential integer overflow
        while (x != 0) {
            int digit = x % 10;
            if (x > 0 && x < 10 && digit == 0) {
                continue;
            } else {
                reverse = reverse * 10 + digit;
                power++;
            }
            x /= 10;
        }
        
        // Check for integer overflow
        if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) reverse;
    }
}