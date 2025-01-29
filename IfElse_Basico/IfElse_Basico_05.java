package If_else;

import java.util.Scanner;

public class IfElse_Basico_05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = sc.nextDouble();

        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.println("O maior número é: " + numero1);

        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.println("O maior número é: " + numero2);

        } else {
            System.out.println("O maior número é: " + numero3);


            sc.close();
        }
    }
}
