package pers.rogerjin.LeetCode.Solution.Array;

import java.util.ArrayList;
import java.util.List;

public class StockTrade {
    public int maxProfitOne(int[] prices) {
        if (prices.length == 0) {
            return 0;
        } else {
            int minPrice = prices[0];
            int maxProfit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                } else {
                    maxProfit = Math.max(maxProfit, prices[i] - minPrice);
                }
            }
            return maxProfit;
        }
    }

    //dynamic programming
    public int maxProfitTwo(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            max += Math.max(0, prices[i + 1] - prices[i]);
        }
        return max;
    }

    public int maxProfitOfLen(int len, int[] prices, List<Integer> maxProfit) {
        if (len == 0 || len == 1) {
            return 0;
        } else if (maxProfit.get(len - 1) != -1) {
            return maxProfit.get(len - 1);
        } else {
            int max = 0;
            for (int i = 1; i < len; i++)
                max = Math.max(max, maxProfitOfLen(len - i, prices, maxProfit) + maxProfitWithIndex(len - i - 1, len - 1, prices));
            maxProfit.set(len - 1, max);
        }

        return maxProfit.get(len - 1);
    }

    //to get the maxPorfit of a period of days
    //0 <= low <= high <= prices.length-1
    public int maxProfitWithIndex(int low, int high, int[] prices) {
        int[] newPrices = new int[high - low + 1];
        for (int i = low; i <= high; i++) {
            newPrices[i - low] = prices[i];
        }
        return maxProfitOne(newPrices);
    }


    public int maxProfitThree(int[] prices) {
        int max = 0;
        if (prices.length == 0) {
            max = 0;
        } else {
            //the case of one transaction
            max = maxProfitOne(prices);
            //the case of two transactions
            for (int i = 0; i < prices.length - 1; i++) {
                max = Math.max(max, maxProfitWithIndex(0, i, prices) + maxProfitWithIndex(i + 1, prices.length - 1, prices));
            }
        }
        return max;
    }

    //with trade fee
    public int maxProfit(int[] prices, int fee) {
        List<Integer> maxProfit = new ArrayList<>();

        //initialize
        for (int i = 0; i < prices.length; i++) {
            maxProfit.add(-1);
        }
        int max = maxProfitOfLen(prices.length, prices, maxProfit, fee);
        return max;
    }

    public int maxProfitOfLen(int len, int[] prices, List<Integer> maxProfit, int fee) {
        if (len == 0 || len == 1) {
            return 0;
        } else if (maxProfit.get(len - 1) != -1) {
            return maxProfit.get(len - 1);
        } else {
            int max = 0;
            for (int i = 1; i < len; i++)
                max = Math.max(max, maxProfitOfLen(len - i, prices, maxProfit) + Math.max(0, maxProfitWithIndex(len - i - 1, len - 1, prices) - fee));
            maxProfit.set(len - 1, max);
        }

        return maxProfit.get(len - 1);
    }

    public static void main(String[] args) {
        StockTrade st = new StockTrade();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int fee = 2;
        int m1 = st.maxProfitOne(prices);
        int m2 = st.maxProfitTwo(prices);
        int m3 = st.maxProfit(prices, fee);
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

    }
}
