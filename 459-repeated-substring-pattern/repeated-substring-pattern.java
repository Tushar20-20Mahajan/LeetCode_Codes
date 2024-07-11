class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int l = 1; l <= n / 2; l++) {
            if (n % l == 0) {
                int times = n / l;
                String pattern = s.substring(0, l);
                StringBuilder str = new StringBuilder();
                while (times > 0) {
                    str.append(pattern);
                    times--;
                }
                if (str.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
