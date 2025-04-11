package org.example;

import java.util.Scanner;

public class Exec2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual valor do seu salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Qual valor do salário minimo: ");
        double salarioMin = scanner.nextDouble();

        System.out.println("Você recebe " + salario/salarioMin + " salários minimos");

    }
}
