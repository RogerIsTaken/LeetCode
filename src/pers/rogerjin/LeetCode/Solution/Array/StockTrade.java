package pers.rogerjin.LeetCode.Solution.Array;

import java.util.ArrayList;
import java.util.List;

public class StockTrade {
    public int maxProfitOne(int[] prices) {
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

    //dynamic programming
    public int maxProfitTwo(int[] prices) {
        List<Integer> maxProfit = new ArrayList<>();

        //initialize
        for (int i = 0; i < prices.length; i++) {
            maxProfit.add(-1);
        }
        return maxProfitOfLen(prices.length, prices, maxProfit);
    }

    public int maxProfitOfLen(int len, int[] prices, List<Integer> maxProfit) {
        if (len == 0 || len == 1) {
            return 0;
        }
        if (maxProfit.get(len - 1) != -1) {
            return maxProfit.get(len - 1);
        }
        for (int i = 1; i < len; i++) {

        }
        return 0;
    }

    //to get the maxPorfit of a period of days
    //0 <= low <= high <= prices.length-1
    public int maxProfitWithIndex(int low,int high,int[] prices){
        int[] newPrices = new int[high-low+1];
        for(int i=low;i<=high;i++){
            newPrices[i-low] = prices[i];
        }
        return maxProfitOne(newPrices);
    }


    public int maxProfitThree(int[] prices) {
        return 0;
    }

    //with trade fee
    public int maxProfit(int[] prices, int fee) {
        return 0;
    }

    public static void main(String[] args) {
        StockTrade st = new StockTrade();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int m = st.maxProfitOne(prices);
        System.out.println(m);

    }
}
