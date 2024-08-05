class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String , Integer> list = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            list.put(arr[i],list.getOrDefault(arr[i],0)+1);
        }
        // int count =0;
        for (String word : list.keySet()) {
            if (list.get(word) == 1) {
                --k;
                if (k==0) {
                    return word;
                }
            }
        }
        return "";
        
    }
}