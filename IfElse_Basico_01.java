package If_else;

import java.util.Scanner;

public class IfElse_Basico_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");

        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println("O número é positivo");
        } else if (numero < 0) {
            System.out.println("O número é negativo");
        } else {
            System.out.println("O número é nulo");
        }

        sc.close();
    }
}
