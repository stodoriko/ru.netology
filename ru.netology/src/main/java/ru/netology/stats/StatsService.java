package ru.netology.stats;

public class StatsService {


    // Метод считывает сумму всех продаж
    public int allSalesSum(int[] sales) {
        int sum = 0;
        for (int value : sales) {
            sum = sum + value;
        }
        return sum;
    }


    // Метод считает среднюю сумму продаж в месяц
    public int avgSum(int[] sales) {
        int sum = allSalesSum(sales);
        return sum / sales.length;
    }


    // Метод показывает номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)
    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month++;
        }
        return maxMonth + 1;
    }


    // Метод считает номер месяца минимальных продаж.
    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    // Метод показывает кол-во месяцев, в которых продажи были ниже среднего
    public int belowAvgMonths(int[] sales) {
        int amountBelowMonths = 0;
        int avgSum = avgSum(sales);

        for (int sale : sales) {
            if (sale < avgSum) {
                amountBelowMonths++;
            }
        }
        return amountBelowMonths;
    }


    // Метод показывает кол-во месяцев, в которых продажи были выше среднего
    public int aboveAvgMonths(int[] sales) {
        int amountAboveMonths = 0;
        int avgSum = avgSum(sales);

        for (int sale : sales) {
            if (sale > avgSum) {
                amountAboveMonths++;
            }
        }
        return amountAboveMonths;
    }

}
