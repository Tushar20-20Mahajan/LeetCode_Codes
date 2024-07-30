class Solution {
    public int minimumDeletions(String s) {
        int count = 0;
        Stack < Character> remaning = new Stack<>();
        for(int i =0 ;i<s.length();i++){
            if(!remaning.isEmpty() && remaning.peek()=='b' && s.charAt(i)=='a'){
                remaning.pop();
                count++;
            }else{
                remaning.add(s.charAt(i));
            }

        }

        return count;
        
    }
}