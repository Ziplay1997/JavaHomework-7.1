package ru.netology.stats;

public class StatsService {

    public int sumAllSales(int[] sum) {
        int sumSales = 0;
        for (int j : sum) {
            sumSales = sumSales + j;
        }
        return sumSales;
    }

    public int averageSumSales(int[] averageSum) {
        int sumSales = 0;

        for (int j : averageSum) {
            sumSales = sumSales + j;
        }
        return sumSales / averageSum.length;
    }

    public int maxSalesInMounth(int[] maxSales) {
        int max = 0;
        for (int i = 0; i < maxSales.length; i++) {
            if (maxSales[i] >= maxSales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int minSalesInMounth(int[] minSales) {
        int min = 0;
        for (int i = 0; i < minSales.length; i++) {
            if (minSales[i] <= minSales[min]) {
                min = i;
            }
        }
        return min + 1;
    }

    public int mounthLowerAverage(int[] array, int average) {
        int lowerAverage = 0;
        for (int j : array) {
            if (j < average) {
                lowerAverage = lowerAverage + 1;
            }
        }
        return lowerAverage;
    }

    public int mounthMoreAverage(int[] array, int average) {
        int moreAverage = 0;
        for (int j : array) {
            if (j > average) {
                moreAverage = moreAverage + 1;
            }
        }
        return moreAverage;
    }


}

