package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/month.csv")
    public void testCountVacationMonth(int expected, int income, int expenses, int threshold) {
        VacationService service = new VacationService();

        int actual = service.calculateMonth(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
