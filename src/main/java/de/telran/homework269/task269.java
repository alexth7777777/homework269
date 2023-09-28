package de.telran.homework269;

public class task269 {
    public static void main(String[] args) {
        int number = 345;
        int hundreds = (number/100);
        int tens = (number / 10 % 10 );
        int units = (number % 10);

        System.out.println("hundreds:" + hundreds );
        System.out.println("Tens:" + tens);
        System.out.println("Units:" + units);
        System.out.print("Число 345 -> " +hundreds+"," +tens+","+units );

    }
}
//2. * Дано трехзначное число. Вывести на экран все цифры этого числа
//Пример: 345
//Вывод в консоль: Число 345 -> 3, 4, 5

