package org.suai;

public class Main {

    public static void main(String[] args) {
        Polynom a = new Polynom(4, "10111");
        Polynom b = new Polynom(4, "10111");
        Polynom c = a.mod(b);
        System.out.print(c);
    }
}
