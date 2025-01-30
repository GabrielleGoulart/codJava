package org.JavaN.br;

import java.util.Scanner;

public class IfElse_Categorias01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 0 && idade <= 11) {
            System.out.println("Criança");

        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolescente");

        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto");
        } else if (idade >= 60) {
            System.out.println("Idoso");
        }
        sc.close();

    }
}





