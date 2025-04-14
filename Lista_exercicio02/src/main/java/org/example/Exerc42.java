package org.example;

import java.util.Random;
import java.util.Scanner;

public class Exerc42 {
    public static void main(String[] args) {
        Random numSorteAx = new Random();

        Integer numSorteado = numSorteAx.nextInt(60);

        Integer contadorDeTentativas = 0;

        for (int i = 0; i <= 40 ; i++) {
           if (numSorteado > 0 && numSorteado <= 59){
               System.out.println(numSorteado);
           }
        }


    }
}
