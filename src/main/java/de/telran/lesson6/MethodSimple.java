package de.telran.lesson6;

public class MethodSimple {
    public static void main(String[] args) {
        int a = 15, b = 10;
        int sum = a + b;

        System.out.println("sum = " + sum);

        a = 25;
        b = 19;
        sum = a + b;
        System.out.printf("sum = " + sum);
    }


        static void printSum(int arg1, int arg2) {
         int sum = arg1 + arg2;
            System.out.println(arg1+ "+" +arg2 + "=" +sum);



        }
    }

