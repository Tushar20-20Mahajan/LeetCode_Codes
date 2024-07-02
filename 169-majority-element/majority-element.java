
class Solution
{
    public int majorityElement(int a[])
    {
        // your code here
        int size = a.length;
        int count =0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(a[i]==a[j]){
                    count++;
                }
            }
            if(count>(size/2)){
                return a[i];
            }
            count =0;
        }
        
        return -1;
    }
}