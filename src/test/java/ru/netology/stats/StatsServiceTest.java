package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    static int[] yearSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void calculateSum(){
        StatsService service = new StatsService();
        int expected = 180;
        int actual = StatsService.calculateYearSales(yearSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateAVG(){
        StatsService service = new StatsService();
        int expected = 15;
        int actual = StatsService.calculateYearAVG(yearSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxMonthSales(){
        StatsService service = new StatsService();
        int expected = 8;
        int actual = StatsService.calculateMonthWithMaxSales(yearSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMinMonthSales(){
        StatsService service = new StatsService();
        int expected = 9;
        int actual = StatsService.calculateMonthWithMinSales(yearSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthsNumberBelowAVG(){
        StatsService service = new StatsService();
        int expected = 5;
        int actual = StatsService.calculateMonthsNumberBelowAVG(yearSales);
        assertEquals(expected, actual);
    }

    @Test
    void calculateMonthsNumberAboveAVG(){
        StatsService service = new StatsService();
        int expected = 5;
        int actual = StatsService.calculateMonthsNumberAboveAVG(yearSales);
        assertEquals(expected, actual);
    }
}