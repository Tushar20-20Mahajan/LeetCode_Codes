class Solution {
    public double averageWaitingTime(int[][] customers) {
        int time = 0;
        double totalWaitingTime = 0.0;
        
        for (int i = 0; i < customers.length; i++) {
            int arrivalTime = customers[i][0];
            int timeToCompleteOrder = customers[i][1];
            time = Math.max(time, arrivalTime);
            time += timeToCompleteOrder;
            totalWaitingTime += (time - arrivalTime);
        }
        
        return totalWaitingTime / customers.length;
    }
}
