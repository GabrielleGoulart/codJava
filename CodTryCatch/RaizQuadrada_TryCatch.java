package com.atvI;
import java.util.Scanner;

public class RaizQuadrada_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite um número: ");
            int num = sc.nextInt();
            double raiz = Math.sqrt(num);
            System.out.println("O resultado da Raiz Quadrada: " + raiz);

        } catch (IllegalArgumentException e) {
            System.err.println("Erro! Você inseriu número NEGATIVO");
            sc.close();
        }
    }
}


