package Homework.Seminar3;

public class DataException extends Throwable {

    public void dataException(String i) {
        System.out.println("Данные о личном имени введены некорректно");
        System.out.printf("Неверный формат: %s", i);
        System.out.println();
    }
}
