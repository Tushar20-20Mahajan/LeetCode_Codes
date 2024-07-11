class Solution {
    public boolean checkRecord(String s) {
        int arr []= new int[2];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                arr[0]++;
                arr[1] = 0;
            }
            else if(s.charAt(i)=='L'){
                arr[1]++;
            }else if(s.charAt(i)=='P'){
                arr[1] = 0;
                continue;
            }

            if(arr[0]>1){
                return false;
            }
            if(arr[1]==3){
                return false;
            }
        }
        return true;
    }
}