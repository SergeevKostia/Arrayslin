package ru.netology.stats;

public class StatsService {
    public int getAmount(int[] sales) {
        int amount = 0;

        for (int i : sales) {
            amount += i;
        }
        return amount;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getAverage(int[] sales) {
        if (sales.length > 0) {
            return getAmount(sales) / sales.length;
        }
        return 0;
    }

    public int underAverage(int[] sales) {
        int undAverage = 0;
        long UnAverage = getAverage(sales);

        for (int sale : sales) {
            if (sale < UnAverage) {
                undAverage += 1;
            }
        }
        return undAverage;
    }

    public int overAverage(int[] sales) {
        int ovrAverage = 0;
        long ovAver = getAverage(sales);

        for (int sale : sales) {
            if (sale > ovAver) {
                ovrAverage += 1;
            }
        }
        return ovrAverage;
    }

}
