// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         String str="";

//         for(int i=0;i<s.length();i++){
//             for(int j = i+1 ;j<s.length();j++){
//                 if((i!=j)&&(s.charAt(i)!=s.charAt(j))){
//                     str+=s.charAt(i);
//                 }
//                 else if((i!=j)&&(s.charAt(i)==s.charAt(j))){
//                     break;
//                 }
//             }
//         }
//         if(s.charAt(0)==s.charAt(1)){
//             return 1;
//         }
//         return str.length();
        
//     }
// }

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int maxLength = 0;
        int start = 0;
        int end = 0;
        Set<Character> set = new HashSet<>();

        while (end < s.length()) {
            if (!set.contains(s.charAt(end))) {
                set.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, end - start);
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }

        return maxLength;
    }
}