package Arrays.Medium;

public class stockBuyAndSell{
    public static void main(String[] args){
        int[] prices = {7, 1, 4, 2, 6, 3};

        System.out.print("The profit made from buying and selling only once: " + buyAndSell(prices));
    }

    public static int buyAndSell(int[] prices){
        int profit = 0;
        int buy = prices[0];
        for(int i = 1; i < prices.length; i++){
            buy = Math.min(buy, prices[i]);

            profit = Math.max(profit, prices[i] - buy);
        }
        return profit;
    }
}