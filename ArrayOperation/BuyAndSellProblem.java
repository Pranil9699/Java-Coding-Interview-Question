package com.ArrayOperation;

import java.util.Arrays;

public class BuyAndSellProblem {

    //Best Time to Buy and Sell Stock
    /*
     * You are given an array prices where prices[i] is the price of a given stock on the ith day.
     * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
     * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
     */
    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (minPrice > prices[i])
                minPrice = prices[i];
            else if (prices[i] - minPrice > maxProfit)
                maxProfit = prices[i] - minPrice;

        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 90, 6, 4 };
        System.out.println("Maximun Profit is : "+maxProfit(arr));
    }
}
