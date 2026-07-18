package Arrays.Medium;

// Given an array nums[] denoting the cost of stock on each day, 
// the task is to find the maximum total profit if we can buy and 
// sell the stocks any number of times.

// Note: We can only sell a stock which we have bought earlier and 
// we cannot hold multiple stocks on any day.

public class overAllStockProfit {
    public void main(String[] args){
        int[] nums = {100, 180, 260, 310, 40, 535, 695};
        
        System.out.print("Maximum profit made from trading is: " + profit(nums));
    }

    public int profit(int[] nums){
        int maxProfit = 0;
        for(int i = 1; i < nums.length; i++){
            int profit = nums[i] - nums[i-1];
            if(profit > 0)
                maxProfit += profit;
        }

        return maxProfit;
    }
}