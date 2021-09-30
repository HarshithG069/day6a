package com.company;
import java.util.Scanner;
public class Perfect {
    public static void main(String args[]) {
        long n;
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextLong();
        int i = 1;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println(" is a perfect number" + n);
        } else
            System.out.println(" is not a perfect number" + n);
    }
}


