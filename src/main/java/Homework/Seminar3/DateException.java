package Homework.Seminar3;

public class DateException extends Exception {

    public void dataException(String i) {
        System.out.println("Данные о дате введены некорректно");
        System.out.printf("Неверный формат: %s", i);
        System.out.println();
    }
}
