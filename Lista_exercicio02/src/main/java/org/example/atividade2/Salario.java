package org.example.atividade2;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Digite o salário mínimo atual: ");
        double salarioMinimo = scanner.nextDouble();

        double qtdSalario = salarioAtual / salarioMinimo;

        System.out.println("Dentro do seu salário de: " + salarioAtual + " possui: " + qtdSalario + " salários mínimos");
    }
}
