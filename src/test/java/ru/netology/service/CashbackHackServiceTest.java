package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
//    @Test
//    void shouldReturn100IfAmountIs900() {
//        // подготовка данных
//        CashbackHackService service = new CashbackHackService();
//        int amount = 900;
//        int expected = 100;
//
//        // выполнение целевого действия
//        int actual = service.remain(amount);
//
//        // сравнение ОР и ФР
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    void shouldReturn0IfAmountIs1000() {
//        // подготовка данных
//        CashbackHackService service = new CashbackHackService();
//        int amount = 1000;
//        int expected = 0;
//
//        // выполнение целевого действия
//        int actual = service.remain(amount);
//
//        // сравнение ОР и ФР
//        assertEquals(expected, actual);
//    }

    @Test
    void shouldReturnExceptionIfAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        assertThrows(IllegalArgumentException.class,
                () -> service.remain(amount)
        );
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/CashbackData.csv", numLinesToSkip = 1)
    void shouldCalculateRemainAmount(int amount, int expected) {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}