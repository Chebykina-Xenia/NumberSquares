package ru.netology.sqrTest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    //параметризованный тест
    @ParameterizedTest
    @CsvSource(value = {"'InRange', 200, 300, 3",
            "'MinResult', 100, 100, 1",
            "'MaxResult', 100, 9801, 90"})
    void squareNumber(String test, int rangeMin, int rangeMax, int expected) {
        SQRService service = new SQRService();
        //выводим фактический результат
        int count = service.squareNumber(rangeMin, rangeMax);

        //проверка ожидаемого и фактического результата
        assertEquals(expected, count);
    }

}