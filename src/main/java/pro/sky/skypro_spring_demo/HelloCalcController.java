package pro.sky.skypro_spring_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping ("/calculator")
public class HelloCalcController {
    private final CalcService calcService;
    public HelloCalcController (CalcService calcService) {
        this.calcService=calcService;
    }
    @GetMapping ()
    public String helloCalc (){
        return calcService.helloCalc();
    }
    @GetMapping(path = "/plus")
    public String plusCalc (@RequestParam ("num1") Optional<Integer> number1, @RequestParam ("num2") Optional<Integer> number2){
        if (number1.isEmpty()) {
            return  "Вы не ввели параметр num1";
        }
        if (number2.isEmpty()) {
            return  "Вы не ввели параметр num1";
        }
        return calcService.plusCalc(number1,number2);
    }
    @GetMapping(path = "/minus")
    public String minusCalc (@RequestParam ("num1") Optional<Integer> number1, @RequestParam ("num2") Optional<Integer> number2){
        if (number1.isEmpty()) {
            return  "Вы не ввели параметр num1";
        }
        if (number2.isEmpty()) {
            return  "Вы не ввели параметр num1";
        }
        return calcService.minusCalc(number1,number2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyCalc (@RequestParam ("num1") Optional<Integer> number1, @RequestParam ("num2") Optional<Integer> number2){
        if (number1.isEmpty()) {
            return  "Вы не ввели параметр num1";
        }
        if (number2.isEmpty()) {
            return  "Вы не ввели параметр num1";
        }
        return calcService.multiplyCalc(number1,number2);
    }
    @GetMapping(path = "/divide")
    public String divideCalc (@RequestParam ("num1") Optional<Integer> number1, @RequestParam ("num2") Optional<Integer> number2){
        if (number1.isEmpty()) {
            return  "Вы не ввели параметр num1";
        }
        if (number2.isEmpty()) {
            return  "Вы не ввели параметр num1";
        }
        return calcService.divideCalc(number1,number2);
    }
}
