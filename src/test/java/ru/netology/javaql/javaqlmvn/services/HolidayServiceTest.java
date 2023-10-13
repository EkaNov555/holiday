package ru.netology.javaql.javaqlmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidayServiceTest {
    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        HolidayService service = new HolidayService();
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;
        int actual = service.calcHoliday(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        HolidayService service = new HolidayService();
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;
        int actual = service.calcHoliday(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
