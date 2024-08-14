package homework3_rework;

public class Program {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int multResult = calc.multiply(3, 2);
        System.out.println(multResult);
        double multiplyResult = calc.multiply(3.3, 2.5);
        System.out.println(multiplyResult);
        int divResult = calc.divide(10, 2);
        System.out.println(divResult);
        double divideResult = calc.divide(3.3, 2.5);
        System.out.println(divideResult);

        System.out.println("================================================");

        Integer[] intArr1 = {1, 2, 3};
        Integer[] intArr2 = {1, 2, 3};
        Integer[] intArr3 = {1, 2, 7};

        String[] strArr1 = {"ab", "bc", "cd"};
        String[] strArr2 = {"ab", "bc", "cd"};
        String[] strArr3 = {"ab", "bc", "de"};

        boolean intArraysEqual = compareArrays(intArr1, intArr2);
        boolean strArraysEqual = compareArrays(strArr1, strArr2);
        boolean intArraysNotEqual = compareArrays(intArr1, intArr3);
        boolean strArraysNotEqual = compareArrays(strArr1, strArr3);

        System.out.println("intArr1 и intArr2: " + intArraysEqual); // true
        System.out.println("strArr1 и strArr2: " + strArraysEqual); // true
        System.out.println("intArr1 и intArr3: " + intArraysNotEqual); // false
        System.out.println("strArr1 и strArr3: " + strArraysNotEqual); // false

        System.out.println("================================================");

        Pair pair1 = new Pair("Ivan", 25);
        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());
        System.out.println(pair1);
    }

    /*
    2. Задание:
    Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true,
    если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных,
    но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
     */

    public static <G> boolean compareArrays(G[] arr1, G[] arr2){
        if(arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if(!arr1[i].equals(arr2[i])){
                return false;
            }
        }
        return true;
    }
}
