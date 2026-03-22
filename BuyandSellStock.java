// 54. leetcode 121: Best Time to Buy and Sell Stock
// You are given an array prices where prices[i] is the price of a given stock on the ith day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

public class BuyandSellStock {
public static int maxProfit(int[] prices) {

        int maxProfit = 0; // This stores our best deal so far
        int minPrice = Integer.MAX_VALUE; // Assume the first day is the cheapest to start or the lowest price we've encountered so far.

        // We start from the second day (index 1)
        for (int i = 0; i < prices.length; i++) {

            // 1. Update our minPrice if today's price is even cheaper. 
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            // 2. Calculate the max profit using Math.max()
            // Compares current maxProfit against the todaysProfit if there is a deal today.
            // todaysProfit = (Today's Price) - (Cheapest price we saw in the past)
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // Example: Prices over 6 days
        int[] prices = {7, 1, 5, 3, 6, 4};
        
        int result = maxProfit(prices);
        
        System.out.println("The maximum profit possible is: " + result);
        System.out.println("Explanation: Buy on day 2 (Price=1) and sell on day 5 (Price=6). Profit = 5.");
    }
}

/*
Time Complexity: O(n) - We traverse the prices array once.
Dry Run Example: [7, 1, 5, 3, 6, 4]
Day 1 (7): minPrice = 7.
Day 2 (1): Profit = $1 - 7 = -6$ (Ignore). minPrice becomes 1 because 1 is less than 7.
Day 3 (5): Profit = $5 - 1 = 4$. maxProfit becomes 4.
Day 4 (3): Profit = $3 - 1 = 2$. maxProfit stays 4.
Day 5 (6): Profit = $6 - 1 = 5$. maxProfit becomes 5.
Day 6 (4): Profit = $4 - 1 = 3$. maxProfit stays 5.
Result: 5.
*/
