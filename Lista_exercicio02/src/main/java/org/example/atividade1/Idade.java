package org.example.atividade1;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();

        System.out.println("Qual é o ano atual: ");
        int anoAtual = scanner.nextInt();

        int idade = anoAtual - anoNascimento;
        System.out.println("A sua idade é: " + idade + " anos");
    }
}
