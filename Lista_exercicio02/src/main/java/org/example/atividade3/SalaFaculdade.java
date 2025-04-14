package org.example.atividade3;

import java.util.Scanner;

public class SalaFaculdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de homens: ");
        int qtdHomem = scanner.nextInt();

        System.out.println("Digite a quantidade de mulheres: ");
        int qtdMulher = scanner.nextInt();

        double soma = qtdHomem + qtdMulher;

        double percentualHomem = qtdHomem * 100 / soma;
        double percentualMulher = qtdMulher * 100 / soma;

        System.out.println("Nesta sala de aula possui: " + percentualHomem + " porcento do público homem e " + percentualMulher + " porcento do público de mulheres");
    }
}
