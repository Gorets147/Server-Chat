package homework3_rework;

/*
1. Задание:
Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
sum(), multiply(), divide(), subtract(). Параметры этих методов – два числа разного типа,
над которыми должна быть произведена операция. Методы должны возвращать результат своей работы.
 */

public class Calculator {



    public static <V extends Number> V sum(V num1, V num2){
        if (num1 instanceof Integer && num2 instanceof Integer){
            return (V) Integer.valueOf(num1.intValue() + num2.intValue());
        } else if (num1 instanceof Double && num2 instanceof Double){
            return (V) Double.valueOf(num1.doubleValue() + num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported type");
        }
    }

    public static <V extends Number> V subtract(V num1, V num2){
        if (num1 instanceof Integer && num2 instanceof Integer){
            return (V) Integer.valueOf(num1.intValue() - num2.intValue());
        } else if (num1 instanceof Double && num2 instanceof Double){
            return (V) Double.valueOf(num1.doubleValue() - num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported type");
        }
    }

    public static <V extends Number> V multiply(V num1, V num2){
        if (num1 instanceof Integer && num2 instanceof Integer){
            return (V) Integer.valueOf(num1.intValue() * num2.intValue());
        } else if (num1 instanceof Double && num2 instanceof Double){
            return (V) Double.valueOf(num1.doubleValue() * num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported type");
        }
    }

    public static <V extends Number> V divide(V num1, V num2){
        if (num1 instanceof Integer && num2 instanceof Integer){
            return (V) Integer.valueOf(num1.intValue() / num2.intValue());
        } else if (num1 instanceof Double && num2 instanceof Double){
            return (V) Double.valueOf(num1.doubleValue() / num2.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported type");
        }
    }

}
