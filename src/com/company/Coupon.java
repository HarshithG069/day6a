package com.company;
import java.util.Scanner;
import java.util.*;
public class Coupon {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] isCollected = new boolean[n];
        int count = 0;
        int number = 0;

        while (number < n) {
            int value = (int) (Math.random() * n);
            count++;
            if (!isCollected[value]) {
                number++;
                isCollected[value] = true;
            }
        }


        System.out.println(count);
    }
}
