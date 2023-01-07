package ru.netology.stats;

public class MinSalesService {
    public int minSalesInMounth(int[] minSales) {
        int min = 0;
        for (int i = 0; i < minSales.length; i++) {
            if (minSales[i] < minSales[min]) {
                min = i;
            }
        }
        return min + 1;
    }
}