package homework3_rework;

/*
1. Задание:
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
 */

public class Calculator {



    public static <V extends Number> double sum(V num1, V num2){
        return num1.doubleValue() + num2.doubleValue();
    }

    public static <V extends Number> double subtract(V num1, V num2){
        return num1.doubleValue() - num2.doubleValue();
    }

    public static <V extends Number> double multiply(V num1, V num2){
        return num1.doubleValue() * num2.doubleValue();
    }

    public static <V extends Number> double divide(V num1, V num2){
        if(num2.doubleValue() == 0){
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

}
