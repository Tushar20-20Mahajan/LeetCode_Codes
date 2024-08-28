class Solution {
    public boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!list.isEmpty() && s.charAt(i)=='}' && list.peek()=='{'){
                list.pop();
            }else if(!list.isEmpty() && s.charAt(i)==')' && list.peek()=='('){
                list.pop();
            }else if(!list.isEmpty() && s.charAt(i)==']' && list.peek()=='['){
                list.pop();
            }else{
                list.push(s.charAt(i));
            }
        }
        if(list.isEmpty()){
            return true;
        }
        return false;
    }
}