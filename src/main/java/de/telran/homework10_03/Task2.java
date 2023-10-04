package de.telran.homework10_03;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число один: ");
        int myInt1 = scanner.nextInt();
        System.out.print("Введите число два: ");
        int myInt2 = scanner.nextInt();
        printSum(myInt1, myInt2);
        printDif(myInt1, myInt2);
        printDiv(myInt1, myInt2);
        printMult(myInt1, myInt2);


    }
    static void printSum(int arg1, int arg2) {
        int sum = arg1 + arg2;
        System.out.println("Сумма = " + sum);

    }
    static void printDif(int arg1, int arg2) {
        int dif = arg1 - arg2;
        System.out.println("Разность = " + dif);
    }

        static void printDiv(int arg1, int arg2) {
        double div = (double) arg1 / arg2;
        System.out.println("Частное = " + div);

    }
    static void printMult(int arg1, int arg2) {
        int mult = arg1 * arg2;
        System.out.println("Произведение = " + mult);}

}
//№ 2
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль