class Solution {
    public String strWithout3a3b(int x, int y) {
        StringBuilder str = new StringBuilder();
        char a ='a' ;
        char b ='b';
        int i = x;
        int j = y;
        if(y>x){
           a ='b' ;
           b ='a';
           i = y;
           j = x;
        }

        while(i>0){
            str.append(a);
            i--;
            if(i>j){
                str.append(a);
                i--;
            }
            if(j>0){
                str.append(b);
                j--;
            }
        }
        return str.toString();
    }
}