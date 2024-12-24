package exercise2;

import java.math.BigDecimal;
import java.math.RoundingMode;
/*
Создайте класс "Калькулятор", который будет иметь методы для выполнения основных
математических операций, таких как сложение, вычитание, умножение и деление. Реализуйте
методы, принимающие два числа в качестве параметров и возвращающие результат операции.
*/
public class Сalculator {

    public int addition (int x, int y) {
        try {
            return x + y;
        }
        catch (ArithmeticException e){
            return 0;
        }
    };

    public double addition (double x, double y) {
        try {
            return x + y;
        }
        catch (ArithmeticException e){
            return 0.0;
        }
    };

    public int subtraction (int x, int y) {
        try {
            return x - y;
        }
        catch (ArithmeticException e){
            return 0;
        }
    };

    public double subtraction (double x, double y) {
        try {
            return x - y;
        }
        catch (ArithmeticException e){
            return 0.0;
        }
    };

    public int multiplication (int x, int y) {
        try {
            return x * y;
        }
        catch (ArithmeticException e){
            return 0;
        }
    };

    public double multiplication (double x, double y) {
        BigDecimal first = new BigDecimal(Double.toString(x));
        BigDecimal second = new BigDecimal(Double.toString(y));
        try {
            return first.multiply(second).doubleValue();
        }
        catch (ArithmeticException e) {
            return 0.0;
        }
    };

    public double division (double x, double y) {
        BigDecimal first = new BigDecimal(Double.toString(x));
        BigDecimal second = new BigDecimal(Double.toString(y));
        try {
            return first.divide(second, 10, RoundingMode.HALF_UP).doubleValue();}
        catch (ArithmeticException e){
            System.out.println("You can't divide by zero.");
            return 0.0;
        }
    };

//    public static void main(String[] args) {
//        Сalculator test = new Сalculator();
//        System.out.println(test.addition(1, 5));
//        System.out.println(test.subtraction(1, 5));
//        System.out.println(test.multiplication(1, 0.2));
//        System.out.println(test.division(1, 0.2));
//    }
}


