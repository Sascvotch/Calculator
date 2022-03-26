package pro.sky.skypro_spring_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public String plusCalc (@RequestParam ("num1") int number1, @RequestParam ("num2") int number2){
        return calcService.plusCalc(number1,number2);
    }
    @GetMapping(path = "/minus")
    public String minusCalc (@RequestParam ("num1") int number1, @RequestParam ("num2") int number2){
        return calcService.minusCalc(number1,number2);
    }
    @GetMapping(path = "/multiply")
    public String multiplyCalc (@RequestParam ("num1") int number1, @RequestParam ("num2") int number2){
        return calcService.multiplyCalc(number1,number2);
    }
    @GetMapping(path = "/divide")
    public String divideCalc (@RequestParam ("num1") int number1, @RequestParam ("num2") int number2){
        return calcService.divideCalc(number1,number2);
    }
}
