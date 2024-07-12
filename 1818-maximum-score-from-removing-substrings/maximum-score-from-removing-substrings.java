// import java.util.ArrayList;

// class Solution {

//     public static int maxPoints(ArrayList<Character> list, int x, int y) {
//         int finalScore = 0;

//         if (x > y) {
//             char firstChar = 'a';
//             char secondChar = 'b';
//             int primaryScore = x;
//             int secondaryScore = y;
            
//             // Removing "ab" first
//             for (int i = 0; i < list.size() - 1; ) {
//                 if (list.get(i) == firstChar && list.get(i + 1) == secondChar) {
//                     finalScore += primaryScore;
//                     list.remove(i); // Remove 'a'
//                     list.remove(i); // Remove 'b'
//                     // No need to increment i, re-check current index
//                 } else {
//                     i++;
//                 }
//             }
            
//             // Removing "ba" second
//             for (int i = 0; i < list.size() - 1; ) {
//                 if (list.get(i) == secondChar && list.get(i + 1) == firstChar) {
//                     finalScore += secondaryScore;
//                     list.remove(i); // Remove 'b'
//                     list.remove(i); // Remove 'a'
//                     // No need to increment i, re-check current index
//                 } else {
//                     i++;
//                 }
//             }
//         } else {
//             char firstChar = 'b';
//             char secondChar = 'a';
//             int primaryScore = y;
//             int secondaryScore = x;

//             // Removing "ba" first
//             for (int i = 0; i < list.size() - 1; ) {
//                 if (list.get(i) == firstChar && list.get(i + 1) == secondChar) {
//                     finalScore += primaryScore;
//                     list.remove(i); // Remove 'b'
//                     list.remove(i); // Remove 'a'
//                     // No need to increment i, re-check current index
//                 } else {
//                     i++;
//                 }
//             }
            
//             // Removing "ab" second
//             for (int i = 0; i < list.size() - 1; ) {
//                 if (list.get(i) == secondChar && list.get(i + 1) == firstChar) {
//                     finalScore += secondaryScore;
//                     list.remove(i); // Remove 'a'
//                     list.remove(i); // Remove 'b'
//                     // No need to increment i, re-check current index
//                 } else {
//                     i++;
//                 }
//             }
//         }
//         return finalScore;
//     }

//     public int maximumGain(String s, int x, int y) {
//         ArrayList<Character> charList = new ArrayList<>();
//         for (char c : s.toCharArray()) {
//             charList.add(c);
//         }
//         return maxPoints(charList, x, y);
//     }

// }


import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public static int maxPoints(String s, int x, int y) {
        Deque<Character> stack = new ArrayDeque<>();
        int finalScore = 0;

        // First pass for the higher score pair
        if (x > y) {
            finalScore += processPairs(s, stack, 'a', 'b', x);
            finalScore += processPairs(stack, 'b', 'a', y);
        } else {
            finalScore += processPairs(s, stack, 'b', 'a', y);
            finalScore += processPairs(stack, 'a', 'b', x);
        }

        return finalScore;
    }

    private static int processPairs(String s, Deque<Character> stack, char firstChar, char secondChar, int score) {
        int totalScore = 0;
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == firstChar && c == secondChar) {
                stack.pop();
                totalScore += score;
            } else {
            stack.push(c);
            }
        }
        return totalScore;
    }

    private static int processPairs(Deque<Character> stack, char firstChar, char secondChar, int score) {
        Deque<Character> newStack = new ArrayDeque<>();
        int totalScore = 0;
        while (!stack.isEmpty()) {
            char c = stack.pollLast();
            if (!newStack.isEmpty() && newStack.peek() == firstChar && c == secondChar) {
                newStack.pop();
                totalScore += score;
            } else {
                newStack.push(c);
            }
        }
        stack.addAll(newStack);
        return totalScore;
    }

    public int maximumGain(String s, int x, int y) {
        return maxPoints(s, x, y);
    }
}
