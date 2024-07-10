// class Solution {
//     public int minOperations(String[] logs) {
//         Stack<String> list = new Stack<>();
//         for(int i=0;i<logs.length;i++){
//             if(!list.isEmpty() && logs[i].equals("../")){
//                 list.pop();
//             }else if(logs[i].equals("./")){
//                 continue;
//             }else{
//                 if(!logs[i].equals("../")){
//                     list.push(logs[i]);
//                 }
//             }
//         }
//         return list.size();
//     }
// }

class Solution {
    public int minOperations(String[] logs) {
        int res = 0;

        for (String log : logs) {
            if (log.equals("../")) {
                if (res > 0) {
                    res--;
                }
            } else if (!log.equals("./")) {
                res++;
            }
        }

        return res;
    }
}