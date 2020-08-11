package ru.netology.stats;

public class StatsService {

    public static int calculateYearSales (int[] month){
        int yearSum = 0;
        for(int item : month){
            yearSum += item;
        }
        return yearSum;
    }

    public static int calculateYearAVG (int[] month){
        int yearSum = StatsService.calculateYearSales(month);
        int yearAVG;
        yearAVG = yearSum / 12;
        return yearAVG;
    }

    public static int calculateMonthWithMaxSales (int[] month){
        int monthWithMaxSales = 0;
        int index = 0;
        int monthWithMaxSalesIndex = 0;
        for(int item : month){
            index ++;
            if(item >= monthWithMaxSales){
                monthWithMaxSales = item;
                monthWithMaxSalesIndex = index;
            }
        }
        return monthWithMaxSalesIndex;
    }

    public static int calculateMonthWithMinSales (int[] month){
        int monthWithMinSales = month[0];
        int index = 0;
        int monthWithMinSalesIndex = 0;
        for(int item : month){
            index ++;
            if(item <= monthWithMinSales){
                monthWithMinSales = item;
                monthWithMinSalesIndex = index;
            }
        }
        return monthWithMinSalesIndex;
    }

    public static int calculateMonthsNumberBelowAVG (int[] month) {
        int yearAVG = StatsService.calculateYearAVG(month);
        int monthsNumber = 0;
        for(int item : month){
            if(item < yearAVG){
                monthsNumber++;
            }
        }
        return monthsNumber;
    }

    public static int calculateMonthsNumberAboveAVG (int[] month) {
        int yearAVG = StatsService.calculateYearAVG(month);
        int monthsNumber = 0;
        for(int item : month){
            if(item > yearAVG){
                monthsNumber++;
            }
        }
        return monthsNumber;
    }
}