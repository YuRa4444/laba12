package com.company;

public class task5 {

    public static void main(String[] args) {
        int a = 0;
        int array1[] = new int[15];

        for (int i = 0; i < 15; i++) {
            array1[i] = (int) Math.round(Math.random() * 10);
            System.out.println(array1[i]);

            if (array1[i] % 2 == 0) {
                a++;
            }
        }
        System.out.print("Кількість парних чисел: "+a);

    }
}