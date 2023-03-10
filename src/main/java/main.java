import ru.netology.stats.*;

public class main {
    public static void main(String[] args) {
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        // СУММА ВСЕХ ПРОДАЖ
        StatsService service = new StatsService();
        int actiual = service.sumAllSales(arr);
        System.out.println("Сумма всех продаж: " + actiual);

        // СРЕДНЯЯ СУММА ВСЕХ ПРОДАЖ
        StatsService service1 = new StatsService();
        int actiual1 = service1.averageSumSales(arr);
        System.out.println("Средняя сумма всех продаж: " + actiual1);

        // МЕСЯЦ, КОГДА БЫЛО МАКСИМАЛЬНОЕ КОЛИЧЕСТВО ПРОДАЖ
        StatsService service2 = new StatsService();
        int actiual2 = service2.maxSalesInMounth(arr);
        System.out.println("Месяц. в котором был пик продаж: " + actiual2);

        // МЕСЯЦ, КОГДА БЫЛО МИНИМАЛЬНОЕ КОЛИЧЕСТВО ПРОДАж
        StatsService service3 = new StatsService();
        int actiual3 = service3.minSalesInMounth(arr);
        System.out.println("Месяц. в котором была минимальная продажа: " + actiual3);

        // МЕСЯЦ, КОГДА БЫЛО МИНИМАЛЬНОЕ КОЛИЧЕСТВО ПРОДАж
        StatsService service4 = new StatsService();
        int actiual4 = service4.mounthLowerAverage(arr);
        System.out.println("Количество месяцев с продажами ниже среднего: " + actiual4);

        // МЕСЯЦ, КОГДА БЫЛО МИНИМАЛЬНОЕ КОЛИЧЕСТВО ПРОДАж
        StatsService service5 = new StatsService();
        int actiual5 = service5.mounthMoreAverage(arr);
        System.out.println("Количество месяцев с продажами выше среднего: " + actiual5);


    }

}

