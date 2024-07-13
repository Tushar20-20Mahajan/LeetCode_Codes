class Solution {
    class Pair implements Comparable<Pair>{
        int position ;
        int index ;
        int health;
        char direction;

        public Pair(int position, int index,int health, char direction) {
            this.position = position;
            this.index=index;
            this.health = health;
            this.direction = direction;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.position, other.position);
        }

        public static Comparator<Pair> compareByIndex() {
            return new Comparator<Pair>() {
                @Override
                public int compare(Pair p1, Pair p2) {
                    return Integer.compare(p1.index, p2.index);
                }
            };
        }
    }
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        ArrayList<Pair> list = new ArrayList<>();
        for(int i=0;i<positions.length;i++){
            Pair newPair = new Pair(positions[i],i,healths[i],directions.charAt(i));
            list.add(newPair);
        }
        Collections.sort(list);
        Stack<Pair> stack = new Stack<>();
        for(Pair robot : list){
            while(!stack.isEmpty() && stack.peek().direction=='R' && robot.direction=='L'){
                Pair top = stack.pop();
                if(top.health>robot.health){
                    top.health--;
                    stack.push(top);
                    robot = null;
                    break;
                }else if(top.health<robot.health){
                    robot.health--;
                }else{
                    robot=null;
                    break;
                }
            }
            if(robot!=null){
                stack.push(robot);
            }
        }

        ArrayList<Pair> newList = new ArrayList<>(stack);
        newList.sort(Pair.compareByIndex());
        ArrayList<Integer> finalHealth = new ArrayList<>();
        for(Pair robots : newList){
            finalHealth.add(robots.health);
        }

        return finalHealth;

    }
}