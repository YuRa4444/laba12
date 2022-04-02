package com.company;

public class task3 {

    public static void main(String[] args) {

        int array1[] = new int[20];
        int array2[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array1[i] = (int) Math.round(Math.random() * 9);
            System.out.print("1)" + array1[i] + ", ");
            array2[i] = array1[i];


            if (array1[i] % 2 != 0) {
                array2[i] = array2[i] * 0;
            }
            System.out.println("2)" + array2[i] + ", ");


        }
    }
}