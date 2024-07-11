class Solution {
    public boolean validPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        int lp = 0;
        int rp = s.length() - 1;
        boolean ans = true;
        int count = 0;

        while (lp < rp) {
            if (s.charAt(lp) != s.charAt(rp)) {
                if (count == 1) {
                    return false;
                } else {
                    count = 1;
                    // Check by skipping the character at lp
                    if (isPalindrome(s, lp + 1, rp)) {
                        return true;
                    }
                    // Check by skipping the character at rp
                    else if(isPalindrome(s, lp, rp - 1)) {
                        return true;
                    }
                    return false;
                }
            } else {
                lp++;
                rp--;
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int lp, int rp) {
        while (lp < rp) {
            if (s.charAt(lp) != s.charAt(rp)) {
                return false;
            }
            lp++;
            rp--;
        }
        return true;
    }
}
