import ru.netology.stats.*;

public class main {
    public static void main(String[] args) {
        int[] arr = {
                42, 89, 100, 45, 28, 21, 99, 96, 57, 32, 89, 12
        };

        // СУММА ВСЕХ ПРОДАЖ
        SumSalesService service = new SumSalesService();
        int actiual = service.sumAllSales(arr);
        System.out.println("Сумма всех продаж: " + actiual);

        // СРЕДНЯЯ СУММА ВСЕХ ПРОДАЖ
        AverageSumSalesService service1 = new AverageSumSalesService();
        int actiual1 = service1.averageSumSales(arr);
        System.out.println("Средняя сумма всех продаж: " + actiual1);

        // МЕСЯЦ, КОГДА БЫЛО МАКСИМАЛЬНОЕ КОЛИЧЕСТВО ПРОДАЖ
        MaxSalesService service2 = new MaxSalesService();
        int actiual2 = service2.maxSalesInMounth(arr);
        System.out.println("Месяц. в котором был пик продаж: " + actiual2);

        // МЕСЯЦ, КОГДА БЫЛО МИНИМАЛЬНОЕ КОЛИЧЕСТВО ПРОДАж
        MinSalesService service3 = new MinSalesService();
        int actiual3 = service3.minSalesInMounth(arr);
        System.out.println("Месяц. в котором была минимальная продажа: " + actiual3);

        // МЕСЯЦ, КОГДА БЫЛО МИНИМАЛЬНОЕ КОЛИЧЕСТВО ПРОДАж
        MountLowerAverageService service4 = new MountLowerAverageService();
        int actiual4 = service4.mounthLowerAverage(arr, actiual1);
        System.out.println("Количество месяцев с продажами ниже среднего: " + actiual4);

        // МЕСЯЦ, КОГДА БЫЛО МИНИМАЛЬНОЕ КОЛИЧЕСТВО ПРОДАж
        MounthMoreAverageService service5 = new MounthMoreAverageService();
        int actiual5 = service5.mounthMoreAverage(arr, actiual1);
        System.out.println("Количество месяцев с продажами выше среднего: " + actiual5);

    }
}
