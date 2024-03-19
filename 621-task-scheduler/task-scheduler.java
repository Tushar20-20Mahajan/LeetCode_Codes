

class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Step 1: Count the frequency of each task
        int[] taskCount = new int[26];
        for (char task : tasks) {
            taskCount[task - 'A']++;
        }
        
        // Step 2: Sort the task frequencies
        Arrays.sort(taskCount);
        
        // Step 3: Initialize a max heap to store task frequencies
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int count : taskCount) {
            if (count > 0) {
                maxHeap.offer(count);
            }
        }
        
        // Step 4: Calculate the idle slots required
        int maxCount = maxHeap.poll() - 1;
        int idleSlots = maxCount * n;
        
        // Step 5: Update the idle slots considering other tasks
        while (!maxHeap.isEmpty()) {
            idleSlots -= Math.min(maxCount, maxHeap.poll());
        }
        
        // Step 6: Return the total intervals required
        return idleSlots > 0 ? idleSlots + tasks.length : tasks.length;
    }
}
