class Solution {
    public int minimumLength(String s) {
        if (s == null || s.length() == 0) {
            return 0; // Edge case: empty string
        } else if (s.length() == 1) {
            return 1; // Edge case: string with length 1
        }

        int lp = 0;
        int rp = s.length() - 1;

        while (lp < rp && s.charAt(lp) == s.charAt(rp)) {
            char currentChar = s.charAt(lp);
            // Move lp to the right until it's no longer equal to currentChar
            while (lp <= rp && s.charAt(lp) == currentChar) {
                lp++;
            }
            // Move rp to the left until it's no longer equal to currentChar
            while (lp <= rp && s.charAt(rp) == currentChar) {
                rp--;
            }
        }

        // At this point, lp and rp have converged or crossed over, 
        // so we return the remaining length between them
        return rp - lp + 1;
    }
}
