package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // Массив для тестирования
    int[] arr = {
            42, 89, 100, 45, 28, 21, 99, 96, 57, 32, 89, 12
    };

    // Получаем среднее значение продаж для тестов
    AverageSumSalesService service1 = new AverageSumSalesService();
    int averageSum = service1.averageSumSales(arr);


    // Тест на проверку количества продаж за год
    @Test
    public void sumSalesServiceTest() {
        SumSalesService service = new SumSalesService();

        int expected = 710;
        int actual = service.sumAllSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    // Тест на проверку средней суммы продаж
    @Test
    public void averageSumSalesServiceTest() {
        AverageSumSalesService service = new AverageSumSalesService();

        int expected = 59;
        int actual = service.averageSumSales(arr);

        Assertions.assertEquals(expected, actual);
    }

    // Тест на проверку нахождения месяца с пиком продаж
    @Test
    public void maxSalesServiceTest() {
        MaxSalesService service = new MaxSalesService();

        int expected = 3;
        int actual = service.maxSalesInMounth(arr);

        Assertions.assertEquals(expected, actual);
    }

    // Тест на проверку нахождения месяца с минимумом продаж
    @Test
    public void minSalesServiceTest() {
        MinSalesService service = new MinSalesService();

        int expected = 12;
        int actual = service.minSalesInMounth(arr);

        Assertions.assertEquals(expected, actual);
    }

    // Тест на проверку нахождения количества месяцев в которых продажи были ниже среднего
    @Test
    public void mounthLowerAverageServiceTest() {
        MountLowerAverageService service = new MountLowerAverageService();

        int expected = 7;
        int actual = service.mounthLowerAverage(arr, averageSum);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mounthMoreAverageServiceTest() {
        MounthMoreAverageService service = new MounthMoreAverageService();

        int expected = 5;
        int actual = service.mounthMoreAverage(arr, averageSum);

        Assertions.assertEquals(expected, actual);
    }

}