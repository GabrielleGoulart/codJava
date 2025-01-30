package org.JavaN.br;

import java.util.Scanner;


public class IfElse_Categorias03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicita que o usuário insira os valores de pressão arterial
        System.out.print("Digite a pressão sistólica (valor superior): ");
        int sistolica = sc.nextInt();

        System.out.print("Digite a pressão diastólica (valor inferior): ");
        int diastolica = sc.nextInt();

        // Verifica se os valores são válidos para pressão arterial
        if (sistolica < 0 || diastolica < 0) {
            System.out.println("Valores de pressão arterial não podem ser negativos.");
        } else if (sistolica < 120 && diastolica < 80) {
            System.out.println("Pressão arterial: Normal");
        } else if ((sistolica >= 120 && sistolica <= 139) || (diastolica >= 80 && diastolica <= 89)) {
            System.out.println("Pressão arterial: Moderada");
        } else if (sistolica >= 140 || diastolica >= 90) {
            System.out.println("Pressão arterial: Alta");
        }

        sc.close();
    }
}
