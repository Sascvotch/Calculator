package pro.sky.skypro_spring_demo;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String helloCalc (){
        return "Добро пожаловать в калькулятор";
    }

    public String plusCalc (int number1, int number2){
        double numberSum = number1+number2;
        return number1 + " + " +number2 + "=" + numberSum;
    }
    public String minusCalc (int number1, int number2){
        double numberDiff = number1-number2;
        return number1 + " + " +number2 + "=" + numberDiff;
    }
    public String multiplyCalc (int number1, int number2){
        double numberMult = number1*number2;
        return number1 + " * " +number2 + "=" + numberMult;
    }
    public String divideCalc (int number1, int number2){

        if (number2!=0) {
            double numberDiv = number1 / number2;
            return number1 + " / " + number2 + "=" + numberDiv;
        } else {
            return "На ноль делить нельзя, поменяйте значение параметра";
        }
    }
}
