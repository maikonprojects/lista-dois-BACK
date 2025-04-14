package org.example;

public class Exec49 {
    public static void main(String[] args) {

        int ax = 0;
        int fibona = 1;
        int axFibona = 0;
        while (ax < 50){
            System.out.println(fibona);
            fibona = fibona + axFibona;
            axFibona = fibona;
            ax++;
        }
    }
}
