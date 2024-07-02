class Solution {
    public boolean isPalindrome(int x) {
        int original= x;
        int reverse=0;
        if(x<0){
            return false;
        }
        while(x>0){
            int digit = x%10;
            reverse = reverse*10 + digit;
            x/=10;
        }


        if(original==reverse){
            return true;
        }
        return false;
        
    }
}