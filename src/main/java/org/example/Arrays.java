package org.example;

import java.util.ArrayList;

public class Arrays {
    static ArrayList<String> list = new ArrayList<>();


    ArrayList<String> arrayList = new ArrayList<String>(java.util.Arrays.asList("red", "blue", "green"));
    // Этот метод уже реализован в java.lang.String.
    // Вам не нужно реализовывать его самостоятельно
    String str = "red";
    boolean result = arrayList.contains(str);

    public static boolean contains(String str) {
        if (list.contains(str)) {
            return true;
        } else {
            return false;
        }
    }
}







