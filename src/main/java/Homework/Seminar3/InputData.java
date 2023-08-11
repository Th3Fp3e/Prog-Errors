package Homework.Seminar3;

import java.util.Scanner;

public class InputData {
    public String[] enteredData() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите данные через пробел (фамилия, имя, отчество, дата рождения, номер телефона, пол (m/f)): ");
        String input = sc.nextLine();
        String[] data = input.split(" ");

        if (data.length < 6) {
            System.out.println("Вы ввели недостаточно данных. Повториите еще раз.");
        } else if (data.length > 6) {
            System.out.println("Вы ввели больше данных, чем нужно. Повторите еще раз.");
        }

        return data;
    }
}
