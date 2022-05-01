package pro.sky.skypro_spring_demo.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.skypro_spring_demo.CalcServiceImpl;

import java.util.Optional;

import static java.lang.Integer.valueOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



class CalcTest {
    private final CalcServiceImpl calcService = new CalcServiceImpl();
    public static final Optional<Integer> number1 = Optional.of(4);
    public static final Optional<Integer> number2 = Optional.of(7);

    @Test
    public void getPlusCalc() {
        double plus = number1.get() + number2.get();
        String expected = number1.get() + " + " + number2.get() + "=" + plus;
        String actual = calcService.plusCalc(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void minusCalc() {
        double minus = number1.get() - number2.get();
        String expected = number1.get() + " - " + number2.get() + "=" + minus;
        String actual = calcService.minusCalc(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void multiplyCalc() {
        double multiply = number1.get() * number2.get();
        String expected = number1.get() + " * " + number2.get() + "=" + multiply;
        String actual = calcService.multiplyCalc(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void divideCalc() {
        double divide = number1.get() / number2.get();
        String expected = number1.get() + " / " + number2.get() + "=" + divide;
        String actual = calcService.divideCalc(number1, number2);
        assertEquals(expected, actual);
    }

    @Test
    public void ThrowCalc() {
        assertThrows(IllegalArgumentException.class,
                () -> calcService.divideCalc(number1, Optional.of(0)));
    }

}
