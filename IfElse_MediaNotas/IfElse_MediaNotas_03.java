package If_else;

import java.util.Scanner;

public class IfElse_MediaNotas_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double maiorNota = Math.max(nota1, Math.max(nota2, nota3));
        System.out.println("A maior nota é: " + maiorNota);

        double menorNota = Math.min(nota1, Math.max(nota2, nota3));
        System.out.println("A menor nota é: " + menorNota);
}

    }
