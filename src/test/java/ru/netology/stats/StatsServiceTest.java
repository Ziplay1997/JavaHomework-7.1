package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // Массив для тестирования
    int[] arr = {
            8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
    };


    // Тест на проверку количества продаж за год
    @Test
    public void sumSalesServiceTest() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.sumAllSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    // Тест на проверку средней суммы продаж
    @Test
    public void averageSumSalesServiceTest() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.averageSumSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    // Тест на проверку нахождения месяца с пиком продаж
    @Test
    public void maxSalesServiceTest() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSalesInMounth(arr);

        Assertions.assertEquals(expected, actual);
    }

    // Тест на проверку нахождения месяца с минимумом продаж
    @Test
    public void minSalesServiceTest() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSalesInMounth(arr);

        Assertions.assertEquals(expected, actual);
    }

    // Тест на проверку нахождения количества месяцев в которых продажи были ниже среднего
    @Test
    public void mounthLowerAverageServiceTest() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.mounthLowerAverage(arr);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mounthMoreAverageServiceTest() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.mounthMoreAverage(arr);

        Assertions.assertEquals(expected, actual);
    }

}
