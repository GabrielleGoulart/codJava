package com.atvI;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Soma_TryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();
            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();

            double resultado = num1 + num2;
            System.out.println("O resultado da soma:" + resultado);

        } catch(InputMismatchException e){
          System.err.println("Erro!Você não digitou um número");
        }
        sc.close();
    }
}
