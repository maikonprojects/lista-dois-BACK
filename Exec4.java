package org.example;

import java.util.Scanner;

public class Exec4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double soma = 0.0;
        for (int i = 0; i <= 3; i++) {
            System.out.println("Digte a "+ (i + 1) +"° nota do aluno: ");
            soma += scanner.nextDouble();
        }

        System.out.println("A média desse aluno é: " + soma/4);
    }
}
