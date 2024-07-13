// import java.util.*;

// class Solution {
//     class Pair implements Comparable<Pair> {
//         int position;
//         int index;
//         int health;
//         char direction;

//         public Pair(int position, int index,int health, char direction) {
//             this.position = position;
//             this.index=index;
//             this.health = health;
//             this.direction = direction;
//         }

//         @Override
//         public int compareTo(Pair other) {
//             return Integer.compare(this.position, other.position);
//         }

//         public static Comparator<Pair> compareByIndex() {
//             return new Comparator<Pair>() {
//                 @Override
//                 public int compare(Pair p1, Pair p2) {
//                     return Integer.compare(p1.index, p2.index);
//                 }
//             };
//         }
//     }

//     public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
//         List<Pair> list = new ArrayList<>();
//         for (int i = 0; i < positions.length; i++) {
//             Pair newPair = new Pair(positions[i], i,healths[i], directions.charAt(i));
//             list.add(newPair);
//         }

//         // if list size is 1
//         if (list.size() == 1) {
//             List<Integer> result = new ArrayList<>();
//             result.add(list.get(0).health);
//             return result;
//         }

//         // if list size is more than 1
//         Collections.sort(list);
//         List<Pair> newList = new ArrayList<>();
//         newList.add(list.get(0));

//         for (int i = 1; i < list.size(); i++) {
//             if (!newList.isEmpty() && newList.get(newList.size() - 1).direction =='R' && list.get(i).direction=='L') {
//                 if (newList.get(newList.size() - 1).health == list.get(i).health) {
//                     newList.remove(newList.size() - 1);
//                 } else if (newList.get(newList.size() - 1).health > list.get(i).health) {
//                     newList.get(newList.size() - 1).health = newList.get(newList.size() - 1).health - 1;
//                 } else if (newList.get(newList.size() - 1).health < list.get(i).health) {
//                     list.get(i).health = list.get(i).health - 1;
//                     newList.remove(newList.size() - 1);
//                     newList.add(list.get(i));
//                 }
//             } else {
//                 newList.add(list.get(i));
//             }
//         }

//         newList.sort(Pair.compareByIndex());
//         List<Integer> finalList = new ArrayList<>();
//         for (int i = 0; i < newList.size(); i++) {
//             finalList.add(newList.get(i).health);
//         }

//         return finalList;
//     }
// }


import java.util.*;

class Solution {
    class Pair implements Comparable<Pair> {
        int position;
        int index;
        int health;
        char direction;

        public Pair(int position, int index, int health, char direction) {
            this.position = position;
            this.index = index;
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
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < positions.length; i++) {
            Pair newPair = new Pair(positions[i], i, healths[i], directions.charAt(i));
            list.add(newPair);
        }

        Collections.sort(list);
        Stack<Pair> stack = new Stack<>();

        for (Pair robot : list) {
            while (!stack.isEmpty() && stack.peek().direction == 'R' && robot.direction == 'L') {
                Pair top = stack.pop();
                if (top.health > robot.health) {
                    top.health--;
                    stack.push(top);
                    robot = null;
                    break;
                } else if (top.health < robot.health) {
                    robot.health--;
                } else {
                    robot = null;
                    break;
                }
            }
            if (robot != null) {
                stack.push(robot);
            }
        }

        List<Pair> survivors = new ArrayList<>(stack);
        survivors.sort(Pair.compareByIndex());
        List<Integer> finalList = new ArrayList<>();
        for (Pair survivor : survivors) {
            finalList.add(survivor.health);
        }

        return finalList;
    }

}
