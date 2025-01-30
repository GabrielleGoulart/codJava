package org.JavaN.br;

import java.util.Scanner;

public class IfElse_Categorias02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero : ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("Faixa A");

        } else if (numero >= 11 && numero <= 20) {
            System.out.println("Faixa B");

        } else if (numero >= 21 && numero <= 30) {
            System.out.println("Faixa C");

        } else {
            System.out.println("Número fora das faixas de classificação.");
        }
        sc.close();
    }
}




