package org.example;

import java.util.Scanner;

public class Exec63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de linha desejadas: ");
        Integer qtdLin = scanner.nextInt();

        for (int i = 1; i <= qtdLin; i++) {
            if (i < 10){
                System.out.print("0"+i+" ");
            }else {
                System.out.print("i ");
            }
            for (int j = 1; j <= qtdLin ; j++) {
                System.out.println("");
            }
        }

    }
}
