package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int temp = array[index];
            array[index] = array[array.length - index - 1];
            array[array.length - index - 1] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5};
        int[] result = back(input);
        for (int j : result) {
            System.out.println(j);
        }
    }
}

