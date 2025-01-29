package If_else;

import java.util.Scanner;

public class IfElse_MediaNotas_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        double media = (nota1 + nota2) / 2;
        if (media >= 7) {
            System.out.println("Aprovado! Média: " + media);
        } else {
            System.out.println("Reprovado, que pena a sua Media é: " + media);
        }


    }
}