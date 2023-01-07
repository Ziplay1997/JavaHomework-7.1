package ru.netology.stats;

public class SumSalesService {

    public int sumAllSales(int[] sum) {
        int sumSales = 0;
        for (int i = 0; i < sum.length; i++) {
            sumSales = sumSales + sum[i];
        }
        return sumSales;
    }
}

