package de.telran.home289;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число;");
        int arg1 = scanner.nextInt();
        System.out.print("Введите второе число;");
        int arg2 = scanner.nextInt();

        int sum = arg1 + arg2;
        int dif = arg1 - arg2;
        int mult = arg1 * arg2;
        int div = arg1 / arg2;
        System.out.println("Найдите сумму = " + sum);
        System.out.println("different = " + dif );
        System.out.println("Multiply = " + mult);
        System.out.println("Divide = " + div);


    }

}
//Создайте методы с математическими операциями +, -, *, /
//Каждый метод принимает два числа в параметрах и возвращает результат
//Вызовите все методы в main
//Результат распечатайте в консоль