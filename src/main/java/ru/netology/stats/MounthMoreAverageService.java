package ru.netology.stats;

public class MounthMoreAverageService {
    public int mounthMoreAverage(int[] array, int average) {
        int moreAverage = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > average) {
                moreAverage = moreAverage + 1;
            }
        }
        return moreAverage;
    }
}