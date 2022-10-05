package kz.one;

import java.util.Scanner;


public class TestJava {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какой у Вас рост(cм)");
        int growth = scanner.nextInt();
        System.out.println("Какой у Вас вес(кг)");
        int weight = scanner.nextInt();

        if ((growth - weight) >= 90 && (growth - weight) <= 110) {

            System.out.println("Вы стройный(ая)");
        } else {
            System.out.println("Стандарт утерян :(");
        }
        scanner.close();

    }

}
