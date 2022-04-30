package pro.sky.skypro_spring_demo;

import java.util.Optional;

public interface CalcService {
    String helloCalc();

    String plusCalc(Optional<Integer> number1, Optional<Integer> number2);

    String minusCalc(Optional<Integer> number1, Optional<Integer> number2);

    String multiplyCalc(Optional<Integer> number1, Optional<Integer> number2);

    String divideCalc(Optional<Integer> number1, Optional<Integer> number2);

}
