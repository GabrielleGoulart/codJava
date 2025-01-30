package org.JavaN.br;

import java.util.Scanner;

public class IfElse_Financeiras02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         System.out.print("Digite o valor total da compra: R$:  ");
             double valorTotal = sc.nextDouble();

            double desconto = 0;
        if (valorTotal > 500) {
            desconto = valorTotal * 0.10;
            double valorFinal = valorTotal - desconto;


            System.out.println("Valor total: R$ " + valorTotal);
            System.out.println("Desconto aplicado: R$ " + desconto);
            System.out.println("Valor final após o desconto: R$ " + valorFinal);


                sc.close();
            }
        }

    }

