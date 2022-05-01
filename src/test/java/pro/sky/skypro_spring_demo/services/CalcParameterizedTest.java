package pro.sky.skypro_spring_demo.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.skypro_spring_demo.CalcServiceImpl;

import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CalcParameterizedTest {
    private final CalcServiceImpl calcService = new CalcServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForPlusCalcTests")
    public void calcTest(Optional<Integer> number1, Optional<Integer> number2, String messageExpected) {
        double plus = number1.get() + number2.get();
        String expected = number1.get() + " + " + number2.get() + "=" + plus;
        String actual = calcService.plusCalc(number1, number2);
        assertEquals(messageExpected, actual);
    }

    public static Stream<Arguments> provideParamsForPlusCalcTests() {
        return Stream.of(
                Arguments.of(Optional.of(4), Optional.of(7), "4 + 7=11.0"),
                Arguments.of(Optional.of(0), Optional.of(7), "0 + 7=7.0")
                );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMinusCalcTests")
    public void minusCalc(Optional<Integer> number1, Optional<Integer> number2, String messageExpected) {
        double minus=number1.get()-number2.get();
        String expected =number1.get() + " - " + number2.get() + "=" + minus;
        String actual =calcService.minusCalc(number1, number2);
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideParamsForMinusCalcTests() {
        return Stream.of(
                Arguments.of(Optional.of(4), Optional.of(7), "4 - 7=-3.0"),
                Arguments.of(Optional.of(7), Optional.of(4), "7 - 4=3.0")
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyCalcTests")
    public void multiplyCalc(Optional<Integer> number1, Optional<Integer> number2, String messageExpected) {
        double multiply=number1.get()*number2.get();
        String expected =number1.get() + " * " + number2.get() + "=" + multiply;
        String actual =calcService.multiplyCalc(number1, number2);
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideParamsForMultiplyCalcTests() {
        return Stream.of(
                Arguments.of(Optional.of(4), Optional.of(7), "4 * 7=28.0"),
                Arguments.of(Optional.of(0), Optional.of(4), "0 * 4=0.0")
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsForDivideCalcTests")
    public void divideCalc(Optional<Integer> number1, Optional<Integer> number2, String messageExpected) {
        double divide=number1.get()/number2.get();
        String expected =number1.get() + " / " + number2.get() + "=" + divide;
        String actual =calcService.divideCalc(number1, number2);
        assertEquals(expected, actual);
    }

    public static Stream<Arguments> provideParamsForDivideCalcTests() {
        return Stream.of(
                Arguments.of(Optional.of(4), Optional.of(7), "4 / 7=0.0"),
                Arguments.of(Optional.of(0), Optional.of(4), "0 / 4=0.0")
        );
    }
}
