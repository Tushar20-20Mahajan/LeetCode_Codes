class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count =0;
         if(colors.length==3){
            if((colors[0]==0 && colors[1]==1 && colors[2]==1)||
               (colors[0]==1 && colors[1]==0 && colors[2]==0)||
               (colors[0]==0 && colors[1]==1 && colors[2]==0)||
               (colors[0]==1 && colors[1]==0 && colors[2]==1)||
                (colors[0]==0 && colors[1]==0 && colors[2]==1)||
                (colors[0]==1 && colors[1]==1 && colors[2]==0)){
                count++;
            }
        }else{
              for(int i =1;i<colors.length-1;i++){
            if((colors[i]==1 &&colors[i-1]==0 && colors[i+1]==0) || (colors[i]==0 &&colors[i-1]==1 && colors[i+1]==1)){
                count++;
            }
        }
        if(colors.length>3){
            if(colors[0]==0 && colors[colors.length-1]==1 && colors[colors.length-2]==0) {
                count++;
            }
        }
        if(colors.length>3){
            if(colors[0]==1 && colors[colors.length-1]==0 && colors[colors.length-2]==1) {
                count++;
            }
        }
        if(colors.length>3){
            if (colors[0]==0 && colors[1]==1 && colors[colors.length-1]==1){
                count++;
            }
        }
        if(colors.length>3){
            if(colors[0]==1 && colors[1]==0 && colors[colors.length-1]==0){
                count++;
            }
        }
         }
       
       
        return count;
        
    }
}