package org.example;

import java.util.Scanner;

public class Exec28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3){
            System.out.println("O maior número é o: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é o: " + num2);
        }else {
            System.out.println("O maior número é o: " + num3);
        }
    }
}
