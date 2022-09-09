package Algorythms.GreedyAlghorythms;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {
        final Item item1 = new Item(6, 20);
        final Item item2 = new Item(5, 18);
        final Item item3 = new Item(2, 14);

        final Item[] items = {item1, item2, item3};

        //Сортирую по удельному весу, используя компаратор и метод класса
        Arrays.sort(items, Comparator.comparingDouble(Item::valuePerUnitForWeight).reversed());

        System.out.println(Arrays.toString(items));

        final int W = 7;

        int weightSoFar = 0;
        double valueSoFar = 0;
        int currentItem = 0;

        while (currentItem < items.length && weightSoFar != W) {
            if (weightSoFar + items[currentItem].getWeight() < W) {
                //беру объект целиком
                valueSoFar += items[currentItem].getValue();
                weightSoFar += items[currentItem].getWeight();
            } else {
                //беру только часть объекта
                //но, если объект весит больше W, он сюда не пройдет согласно условию while
                valueSoFar += ((W - weightSoFar) / (double) items[currentItem].getWeight()) *
                        items[currentItem].getValue();
                weightSoFar = W; //полный рюкзак
            }
            currentItem++;
        }
        System.out.println(valueSoFar);
    }
}

class Item {
    private int weight;
    private int value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    public double valuePerUnitForWeight() {
        return value / (double) weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return "{w:" + weight + "v:" + value + "}";
    }
}

