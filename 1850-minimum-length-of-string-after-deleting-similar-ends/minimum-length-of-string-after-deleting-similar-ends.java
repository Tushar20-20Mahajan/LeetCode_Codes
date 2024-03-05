class Solution {
    public int minimumLength(String s) {
        if (s == null || s.length() == 0) {
            return 0; 
        } else if (s.length() == 1) {
            return 1; 
        }

        int lp = 0;
        int rp = s.length() - 1;

        while (lp < rp && s.charAt(lp) == s.charAt(rp)) {
            char currentChar = s.charAt(lp);
           
            while (lp <= rp && s.charAt(lp) == currentChar) {
                lp++;
            }
            
            while (lp <= rp && s.charAt(rp) == currentChar) {
                rp--;
            }
        }

        return rp - lp + 1;
    }
}
