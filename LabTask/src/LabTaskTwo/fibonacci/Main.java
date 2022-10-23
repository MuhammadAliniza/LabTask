package LabTaskTwo.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number how much Fibonacci you wnat to know:");
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(fib(n));
    }
    public static long fib(long n) {
        if ((n == 0) || (n == 1))
            return 0;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
