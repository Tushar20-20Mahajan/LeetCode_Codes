class Solution {
    public String longestCommonPrefix(String[] arr) {
        int n = arr.length;

         Arrays.sort(arr);
        
        StringBuilder s = new StringBuilder();
        for(int i =0;i<arr[0].length();i++){
            s.append(arr[0].charAt(i));
        }
         StringBuilder t = new StringBuilder();
        for(int i =0;i<arr[n-1].length();i++){
            t.append(arr[n-1].charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<Math.min(arr[0].length(),arr[n-1].length());i++){
            if(s.charAt(i)!=t.charAt(i)){
                break;
            }
            else{
                sb.append(s.charAt(i));
            }
            
        }
        if(sb.toString().equals("")){
            return "";
        }
        
        return sb.toString();
        
        
        
    }
}