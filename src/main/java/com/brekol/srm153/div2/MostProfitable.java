package com.brekol.srm153.div2;

/**
 * Created by brekol on 10.12.16.
 */
public class MostProfitable {

    public String bestItem(int[] costs, int[] prices, int[] sales, String[] items) {

        String bestItem = "";
        int bestProfit = 0;
        for (int i = 0; i < costs.length; i++) {
            final int currentProfit = getBestProfit(costs[i], prices[i], sales[i]);
            if (currentProfit > bestProfit && currentProfit > 0) {
                bestItem = items[i];
                bestProfit = currentProfit;
            }
        }
        return bestItem;

    }

    private int getBestProfit(int cost, int price, int sale) {
        return sale * price - sale * cost;
    }
}
