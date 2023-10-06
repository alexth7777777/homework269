package de.telran.lesson8;

public class ExchangeNumber {

    public static void main(String[] args) {
        int a = 2, b = 5;
        System.out.println("a = "+a+"b = "+b);
        int temp = b;
        b = a;
        a = temp;
    }
}
