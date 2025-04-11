package org.example;

import java.util.Scanner;

public class Exec10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário minimo: ");
        Double salLiq = scanner.nextDouble();

        System.out.println("Digite o valor do emprestimo desejado: ");
        Double valEmp = scanner.nextDouble();

        if ( valEmp <= salLiq * 0.3 ){
            System.out.println("Emprestimo concedido!!!");
        }else {
            System.out.println("Emprestimo negado, sentimos muito");
        }

    }
}
