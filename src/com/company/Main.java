package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input natural number:");
        int number = sc.nextInt();

        int three_amount = 0;
        int last_digit = number % 10;
        int last_digit_amount = 0;
        int sum = 0;
        int mult = 1;
        int max_digit = last_digit;
        int min_digit = last_digit;

        while (number > 0){
            int digit = number % 10; // каждую следующую цифру заносим в эту переменную
            if (digit == 3) three_amount++;
            if (digit % 10 == last_digit) last_digit_amount++;
            sum += digit;
            mult *= digit;
            if (max_digit < digit) max_digit = digit;
            if (min_digit > digit) min_digit = digit;
            number /= 10; // в конце каждой итерации "отрезаем" от числа последнюю цифру
        }

        System.out.println(three_amount);
        System.out.println(last_digit_amount);
        System.out.println(sum);
        System.out.println(mult);
        System.out.println(max_digit);
        System.out.println(min_digit);




    }
}
