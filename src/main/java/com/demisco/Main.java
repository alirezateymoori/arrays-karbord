package com.demisco;

import java.util.Arrays;
import java.util.Random;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Long[] array = new Long[100];
        Arrays.fill(array, 5L);
        Long[] copy = Arrays.copyOf(array, 200);
        for (int i = 100; i < copy.length; i++)
            copy[i] = random.nextLong()%10;
//An unmodifiable list:
        List<Integer> asList = Arrays.asList(1, 2 , 3, 4);
        List<Long> asList2 = Arrays.asList(array);
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, 7L);
        int[] a1 = {1,2,3,4};
        int[] a2 = {1,2,3,4};
        System.out.println(a1==a2);
        System.out.println(a1.equals(a2));
        System.out.println(Arrays.equals(a1, a2));
        System.out.println(a1);
        System.out.println(a1.toString());
        System.out.println(Arrays.toString(a1));
    }
}