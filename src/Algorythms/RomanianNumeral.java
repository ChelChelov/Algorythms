package Algorythms;

public class RomanianNumeral {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        char[] numbers = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            numbers[i] = s.charAt(i);
            return numbers[i];
        }
        return -1;
    }
}

