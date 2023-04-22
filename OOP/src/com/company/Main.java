package com.company;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random generator1 = new Random(2);
        System.out.print("From generator1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator1.nextInt(1000) + " ");
        Random generator2 = new Random(21);
        System.out.print("\nFrom generator2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(generator2.nextInt(1000) + " ");
    }
}