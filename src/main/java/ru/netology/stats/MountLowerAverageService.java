package ru.netology.stats;

public class MountLowerAverageService {
    public int mounthLowerAverage(int[] array, int average) {
        int lowerAverage = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                lowerAverage = lowerAverage + 1;
            }
        }
        return lowerAverage;
    }
}
