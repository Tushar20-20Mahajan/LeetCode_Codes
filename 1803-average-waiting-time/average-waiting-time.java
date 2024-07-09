// class Solution {
//     public double averageWaitingTime(int[][] customers) {
//         int time = customers[0][0];
//         double totalWatingTime = 0.0;
//         for(int i = 0;i<customers.length;i++){
//             int timeToCompleteTheOrder = customers[i][1];
//             time = time + timeToCompleteTheOrder;
//             totalWatingTime += time - (double)customers[i][0];
//         }
//         return (totalWatingTime/customers.length);
        
//     }
// }

class Solution {
    public double averageWaitingTime(int[][] customers) {
        int time = 0;
        double totalWaitingTime = 0.0;
        
        for (int i = 0; i < customers.length; i++) {
            int arrivalTime = customers[i][0];
            int timeToCompleteOrder = customers[i][1];
            
            // Update the time to the maximum of current time and customer's arrival time
            time = Math.max(time, arrivalTime);
            
            // Chef starts cooking the order
            time += timeToCompleteOrder;
            
            // Calculate the waiting time for this customer
            totalWaitingTime += (time - arrivalTime);
        }
        
        return totalWaitingTime / customers.length;
    }
}
