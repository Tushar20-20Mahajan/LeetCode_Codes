// class Solution {
//     public int findComplement(int num) {
//         String str = Integer.toString(num,2);
//         String s = new String("");
//         for(int i=0;i<str.length();i++){
//             if(str.charAt(i)=='1'){
//                 s+='0';
//             }else if(str.charAt(i)=='0'){
//                 s+='1';
//             }
//         }
//         return Integer.parseInt(s,2);
//     }
// }

class Solution {
    public int findComplement(int num) {
        int mask = (Integer.highestOneBit(num) << 1) - 1;
        return ~num & mask;
    }
}
