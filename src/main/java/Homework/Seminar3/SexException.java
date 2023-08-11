package Homework.Seminar3;

public class SexException extends Exception {

    public void sexException(String i) {
        System.out.println("Данные о поле введены некорректно");
        System.out.printf("Неверный формат: %s", i);
        System.out.println();
    }
}
