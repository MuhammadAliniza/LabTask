package LabTaskOne;
import java.util.Scanner;
public class CpnCalculator {
    public void calculator(){
        float matric, inter, test;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Matric percentage:");
        matric = sc.nextFloat();

        System.out.println("Enter your Intermediate percentage:");
        inter = sc.nextFloat();

        System.out.println("Enter your Test marks:");
        test = sc.nextInt();

        sc.close();

        System.out.println((matric*0.1) + (inter*0.2) + (test*0.7));
        return;
    }
}
