package Homework.Seminar3;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParseData parseData = new ParseData();
        String newFileName = null;
        WriteData writeFile = new WriteData();

        HashMap<String, Object> data = parseData.parsInputData();
        while (data.size() != 6) {
            try {
                throw new DataException();
            } catch (DataException e) {
                data = parseData.parsInputData();
            }
        }

        newFileName = data.get("Фамилия") + ".txt";
        StringBuilder sb = new StringBuilder();
        for (String str: data.keySet()){
            sb.append(data.get(str));
            sb.append(" ");
        }

        System.out.println(data);
        String filePath = newFileName;
        System.out.println(filePath);
        writeFile.writeData(String.valueOf(sb), filePath);
        }
}
