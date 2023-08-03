package Homework;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class S2Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Object input = sc.nextLine();
            if (input.equals("")) {
                throw new IllegalArgumentException();
            }
            System.out.println("Your input is " + input);
        } catch (IllegalArgumentException e) {
            System.out.println("Empty input won't do. Put something in!");;
        }
    }
}
