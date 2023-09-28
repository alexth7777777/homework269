package de.telran.home289;

public class task1 {
    public static void main(String[] args) {
        String str1 = new String("I study Basic Java!");
        System.out.println("length stroka1 = "+ str1.length());
        System.out.println("пред-последний символ строки: " + str1.charAt(17));

        System.out.println("содержит строка подстроку “Java”:" + str1.contains("Java"));

        String str2 = str1.substring(14,18);
        System.out.println("Вырезать строку Java = " + str2);

        String str3 = str1.replace('a','o');
        System.out.println("Заменить все символы “а” на “о”: " + str3);

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());






    }
}


//№ 1
//Создайте строку через new - I study Basic Java!
//
//Распечатать пред-последний символ строки. Используем метод String.charAt().
//Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
//Вырезать строку Java c помощью метода String.substring().
//Заменить все символы “а” на “о”.
//Преобразуйте строку к верхнему регистру.
//Преобразуйте строку к нижнему регистру.