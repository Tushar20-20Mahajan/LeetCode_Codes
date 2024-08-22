// class Solution {
//     public String removeDuplicates(String s, int k) {
//         Stack<Character> list = new Stack<>();
//         for(int i = 0; i < s.length(); i++) {
//             list.push(s.charAt(i)); 
            
//             if(list.size() >= k) {
//                 char pt = list.peek();
//                 int it = k;
//                 boolean isSame = true;
//                 int size = list.size() - 1;
                
//                 while(it > 1) { 
//                     if(list.get(size) != list.get(size - 1)) {
//                         isSame = false;
//                         break;
//                     }
//                     size--;
//                     it--;
//                 }
//                 it = k;

//                 if(isSame) {  
//                     while(it-- > 0) {
//                         list.pop();
//                     }
//                 }
//             }
//         }
        
//         StringBuilder sb = new StringBuilder();
//         for(char c : list) {
//             sb.append(c);
//         }
        
//         return sb.toString();
//     }
// }

// }
class Solution {
    public String removeDuplicates(String s, int k) {
     Stack<Character> charSt=new Stack<>();
        Stack<Integer> countSt=new Stack<>();
        
        for(char ch:s.toCharArray()){
            if(charSt.size()>0 && charSt.peek()==ch) countSt.push(countSt.peek()+1);
            else countSt.push(1);
            
            charSt.push(ch);
            if(countSt.peek()==k){
                for(int i=0;i<k;i++){
                    charSt.pop();
                    countSt.pop();
                }
            }
        }
        
        StringBuilder sb=new StringBuilder();
        while(charSt.size()>0) sb.append(charSt.pop());
        return sb.reverse().toString();
    }
}