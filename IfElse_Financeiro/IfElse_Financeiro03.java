package org.JavaN.br;

import java.util.Scanner;

public class IfElse_Financeiro03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salario - R$:  ");
        double salario = sc.nextDouble();

        if (salario >= 3000) {
            System.out.println("Você pode financiar esse imovel! ");
        } else {
            System.out.println("Sinto muito, mas você não possuir o valor suficiente");
        }

        sc.close();
    }
}
