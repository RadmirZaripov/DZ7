package ru.netology.javaqa;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        // for (int i = 0; i < sales.length; i++ {
        // totalSale += sales[i];
        // }
        return totalSale;// сумма всех продаж
    }

    public long average(long[] sales) {
        if (sales.length == 0) {
            return 0;
        }
        return sum(sales) / sales.length;
    }

    public int monthMaximumSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;//номер месяца, в котором был пик продаж
    }

    public int monthMinimumSale(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;//номер месяца, в котором был минимум продаж
    }

    public int monthsOverAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale > averageSale)
                counter++;
        }
        return counter;//количество месяцев, в которых продажи были выше среднего
    }

    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        long averageSale = average(sales);
        for (long sale : sales) {
            if (sale < averageSale)
                counter++;
        }
        return counter;//количество месяцев, в которых продажи были ниже среднего
    }

}

