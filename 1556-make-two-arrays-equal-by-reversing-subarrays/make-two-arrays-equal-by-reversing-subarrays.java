class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        if(target.length!=arr.length){
            return false;
        }
        for(int i=0;i<target.length;i++){
            list.add(target[i]);
        }

        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                return false;
            }else{
                list.remove(Integer.valueOf(arr[i]));
            }
        }
        return true;
    }
}