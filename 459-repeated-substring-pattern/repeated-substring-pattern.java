class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int l=1;l<=n/2;l++){
            if(n%l==0){
                int times = n/l;
                String pattern = s.substring(0,l);
                String str = new String("");
                while(times>0){
                    str+=pattern;
                    times--;
                }
                if(str.equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}