package org.JavaN.br;

import java.util.Scanner;

public class IfElse_Financeiro04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salário - R$: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o valor da parcela - R$: ");
        double parcela = sc.nextDouble();

        if (parcela <= salario * 0.10) {
            System.out.println("Você pode comprar produto parcelado! ");
        } else {
            System.out.println("Sinto muito, mas você não pode comprar o produto parcelado");
        }

        sc.close();
    }

}

