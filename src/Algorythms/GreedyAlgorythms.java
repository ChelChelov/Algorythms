package Algorythms;

import java.util.Arrays;

public class GreedyAlgorythms {
    public static void main(String[] args) {
        int[] digits = {3, 1, 7, 9, 9, 5};
        System.out.println(maxNumberOfDigits(digits));
    }

    public static String maxNumberOfDigits(int[] digits) {
        String result = "";
        Arrays.sort(digits);
        for (int i = digits.length - 1; i >= 0; i--)
            result += digits[i];
        return result;
    }
}
