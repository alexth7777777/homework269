package de.telran.homework10_03;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое слово: ");
        String myStr = scanner.next();
        System.out.print("Введите второе слово: ");
        String myStr2 = scanner.next();
        int lengthStroka1 = myStr.length();
        int lengthStroka2 = myStr2.length();
        System.out.println("length stroka1 = "+ lengthStroka1);
        System.out.println("length stroka2 = "+ lengthStroka2);
        int myHalf1 = lengthStroka1/2;
        int myHalf2 = lengthStroka2/2;
        System.out.println("слово, состоящее из первой половины первого слова и второй половины второго слова: "+myStr.substring(0,myHalf1) + myStr2.substring(myHalf2));


    }
}
//1 уровень сложности: №1
//Введите 2 слова, воспользуйтесь сканером, состоящие из четного количества букв (проверьте количество букв в слове).
//Нужно получить слово, состоящее из первой половины первого слова и второй половины второго слова. распечатать на консоль.
//Например:
//ввод - mama, papa
//вывод - mapa