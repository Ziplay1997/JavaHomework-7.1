package ru.netology.stats;

public class AverageSumSalesService {

    public int averageSumSales(int[] averageSum) {
        int sumSales = 0;
        for (int i = 0; i < averageSum.length; i++) {
            sumSales = sumSales + averageSum[i];
        }
        return sumSales / averageSum.length;
    }
}
