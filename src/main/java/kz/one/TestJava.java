package kz.one;

import java.util.Scanner;


public class TestJava {

    public static void main(String[] args) {
        // Юзание if
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой у Вас рост(cм)");
        int growth = scanner.nextInt();
        System.out.println("Какой у Вас вес(кг)");
        float weight = scanner.nextFloat();

        if ((growth - weight) >= 90 && (growth - weight) <= 110) {

            System.out.println("Вы стройный(ая)");
        } else {
            System.out.println("Стандарт утерян :(");
        }
        scanner.close();


        //переполнение
        System.out.println("Задание 2: переполнение");
        byte testByte = 0;
        testByte+=9999;
        System.out.println(testByte);

    }

}
