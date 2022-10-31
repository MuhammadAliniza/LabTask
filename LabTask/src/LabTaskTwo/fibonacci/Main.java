package LabTaskTwo.fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
    public static double fib(int n){
        if(n<=1){
            return n;
        }

        return fib(n-2)+fib(n-1);
    }
}
