package com.codersbay.repetitions;

public class Aufgabe5_2_Repetitions {
    public static void main(String[] args) {
        int result;
        for (int i = 1; i <= 10; i++) {
            System.out.println("times " + i + ":");
            for (int j = 1; j <= 10; j++) {
                result = j * i;
                System.out.printf("%2d * %2d = %3d\n", j, i, result);
            }
        }
    }
}
