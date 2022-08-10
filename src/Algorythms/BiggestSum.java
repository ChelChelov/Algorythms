package Algorythms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BiggestSum {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        Collections.addAll(nums, 3, 1, 7, 9, 9, 5);
        nums.stream().sorted().forEach(s-> System.out.println(s));
    }
}
