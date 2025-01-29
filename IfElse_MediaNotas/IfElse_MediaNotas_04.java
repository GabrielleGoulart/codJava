package If_else;

import java.util.Scanner;

public class IfElse_MediaNotas_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua nota: ");
        double nota = sc.nextDouble();

        if (nota >= 10) {
            System.out.println("Aprovado!");

        } else {
            System.out.println("Reprovado");
        }

    }

}
