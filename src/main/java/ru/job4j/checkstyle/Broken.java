package ru.job4j.checkstyle;

public class Broken {
    private final int sizeOfEmpty = 10;
    public String surname;
    public final String newValue = "";
    private String name;

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {

    }

    Broken() {
    }

}