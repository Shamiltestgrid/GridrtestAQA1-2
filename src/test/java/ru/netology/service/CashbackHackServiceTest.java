package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {
    @Test
    void shouldReturn100IfAmountIs900() {
        // подготовка данных
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        // выполнение целевого действия
        int actual = service.remain(amount);

        // сравнение ОР и ФР
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        // подготовка данных
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        // выполнение целевого действия
        int actual = service.remain(amount);

        // сравнение ОР и ФР
        assertEquals(expected, actual);
    }
}