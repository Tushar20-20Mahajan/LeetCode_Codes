class Solution {
    public String reverseStr(String s, int k) {
        int n = s.length();
        char[] arr = new char[n];
        
        if (n < k) {
            int z = 0;
            for (int i = n - 1; i >= 0; i--) {
                arr[z++] = s.charAt(i);
            }
            return new String(arr);
        }
        
        if (n < 2 * k && n >= k) {
            int z = 0;
            for (int i = k - 1; i >= 0; i--) {
                arr[z++] = s.charAt(i);
            }
            int i = k;
            while (z < n) {
                arr[z++] = s.charAt(i++);
            }
            return new String(arr);
        }
        
        for (int i = 0; i < n; i += 2 * k) {
            int end = Math.min(i + k, n);
            for (int j = end - 1; j >= i; j--) {
                arr[i + end - 1 - j] = s.charAt(j);
            }
            for (int j = end; j < Math.min(i + 2 * k, n); j++) {
                arr[j] = s.charAt(j);
            }
        }
        
        return new String(arr);
    }
}
