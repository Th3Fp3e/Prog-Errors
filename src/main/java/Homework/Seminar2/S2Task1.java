package Homework.Seminar2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class S2Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            float res = sc.nextFloat();
            System.out.println("Your number is " + res);
        } catch (InputMismatchException e) {
            System.out.println("The program ended with " + e + " exception. Please enter a number.");;
        }
    }
}