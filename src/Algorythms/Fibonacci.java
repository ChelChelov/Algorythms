package Algorythms;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        long[] mem = new long[n + 1];

        Arrays.fill(mem, -1);

//        System.out.println(fibNaiveModified(n, mem));

        System.out.println(fibEffective(100));

    }

    // O(n) very fast
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        //Initialize first two values of array
        for (int i = 2; i <= n; i++)
            //Get next indexes of an array
            arr[i] = arr[i - 1] + arr[i - 2];
        //Initialize new value to arr[i] until arr[i] will not be equals arr[n]
        return arr[n];
        //Return the value of [n-number] of Fibonacci numbers ([10] for 10-th Fibonacci = 55)
    }

    // O(2^n) very slow
    private static long fibNaive(int n) {
        if (n <= 1)
            return n;

        return fibNaive(n - 1) + fibNaive(n - 2);
    }

    private static long fibNaiveModified(int n, long[] mem) {
        if (mem[n] != -1)
            return mem[n];
        if (n <= 1)
            return n;
        long result = fibNaiveModified(n - 1, mem) + fibNaiveModified(n - 2, mem);
        mem[n] = result;
        return result;
    }
}

