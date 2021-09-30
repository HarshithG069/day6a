package com.company;
import java.util.Scanner;
public class Prime {
    public static void main(String args[]) {
        int count = 0;
        int staringValue = 2;
        while (count <= 100) {
            int primeNumber = getPrimeNumber(staringValue);
            if (primeNumber != -1) {
                System.out.println("Number is Prime Number : " + primeNumber);
                count++;
            }
            staringValue++;
        }
    }


    private static int getPrimeNumber(int staringValue) {
        for (int i = 2; i <= staringValue / 2; i++) {
            if (staringValue % i == 0)
                return -1;
        }
        return staringValue;
    }

}