import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        
        for (int asteroid : asteroids) {
            while (!stack.isEmpty() && asteroid < 0 && stack.peek() > 0) {
                int top = stack.peek();
                if (top < -asteroid) {
                    stack.pop();
                    continue;
                } else if (top == -asteroid) {
                    stack.pop();
                }
                asteroid = 0;
            }
            
            if (asteroid != 0) {
                stack.push(asteroid);
            }
        }
        
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        
        return result;
    }
}
