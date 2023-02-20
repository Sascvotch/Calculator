package pro.sky.skypro_spring_demo;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CalcServiceImpl implements CalcService {
    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    public String plusCalc(Optional<Integer> number1, Optional<Integer> number2) {
        double numberSum = number1.get() + number2.get();
        return number1.get() + " + " + number2.get() + "=" + numberSum;
    }

    public String minusCalc(Optional<Integer> number1, Optional<Integer> number2) {
        double numberDiff = number1.get() - number2.get();
        return number1.get() + " - " + number2.get() + "=" + numberDiff;
    }

    public String multiplyCalc(Optional<Integer> number1, Optional<Integer> number2) {
        double numberMult = number1.get() * number2.get();
        return number1.get() + " * " + number2.get() + "=" + numberMult;
    }

    public String divideCalc(Optional<Integer> number1, Optional<Integer> number2) {
        if (number2.get() == 0) {
            throw new IllegalArgumentException("деление на ноль");
        }
        double numberDiv = number1.get() / number2.get();
        return number1.get() + " / " + number2.get() + "=" + numberDiv;

    }


}
