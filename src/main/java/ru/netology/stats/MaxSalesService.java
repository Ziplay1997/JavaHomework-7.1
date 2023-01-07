package ru.netology.stats;

public class MaxSalesService {
    public int maxSalesInMounth(int[] maxSales) {
        int max = 0;
        for (int i = 0; i < maxSales.length; i++) {
            if (maxSales[i] > maxSales[max]) {
                max = i;
            }
        }
        return max + 1;
    }
}
