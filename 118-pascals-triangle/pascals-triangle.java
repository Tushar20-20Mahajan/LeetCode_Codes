class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        if(numRows==0){
            return list;
        }
        if(numRows==1){
            list.add(new ArrayList<>());
            list.get(0).add(1);
            return list;
        }
        if(numRows==2){
            list.add(new ArrayList<>());
            list.get(0).add(1);
            list.add(new ArrayList<>());
            list.get(1).add(1);
            list.get(1).add(1);
            return list;
        }

        // if numRows>2
        // for first list
        list.add(new ArrayList<>());
        list.get(0).add(1);
        //for second list
        list.add(new ArrayList<>());
        list.get(1).add(1);
        list.get(1).add(1);
        //for other lists
        for(int i=2;i<numRows;i++){
            ArrayList<Integer> currentList = new ArrayList<>();
            currentList.add(1);
            for(int j=1;j<i;j++){
                currentList.add((list.get(list.size()-1).get(j))+(list.get(list.size()-1).get(j-1)));
            }
            currentList.add(1);
            list.add(currentList);
        }
        return list;
        
    }
}