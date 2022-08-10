package Algorythms.GreedyAlghorythms;

import java.util.Arrays;
import java.util.Collections;

public class MaxDigitValue {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberOfDigits(digits));
    }

    public static String maxNumberOfDigits(int[] digits) {

        return String.join("", // склеивает элементы массива при помощи разделителя (в кавычках)
                Arrays.stream(digits).boxed()// массив в поток + обернуть примитив в класс обертку
                        .sorted(Collections.reverseOrder())// сортировка принимает компаратор, поэтому, и оборачиваю примитив
                        .map(String::valueOf)// привести числа в строки
                        .toArray(String[]::new));// перевести stream в массив строк
//        String result = "";
//        Arrays.sort(digits);
//        for (int i = digits.length - 1; i >= 0; i--)
//            result += digits[i];
//        return result;
    }
}
