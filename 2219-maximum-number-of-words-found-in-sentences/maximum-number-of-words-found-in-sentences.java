class Solution {
    public int mostWordsFound(String[] sentences) {
        int count =0;
        int max=0;
        for(int i=0;i<sentences.length;i++ ){
            for(int j =0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    count++;
                }
            }
             if(max<count){
                    max=Math.max(max,count);
                }
                count=0;
                
        }
        return max+1;
        
    }
}