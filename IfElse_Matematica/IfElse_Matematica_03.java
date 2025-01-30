package If_else;

import java.util.Scanner;

public class IfElse_Matematica_03 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double numero1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = sc.nextDouble();


            if (numero1 % numero2 == 0) {
                System.out.println("os numeros são divisiveis um pelo outro");

            } else {
                System.out.println("os numeros não são divisiveis um pelo outro");

            }
        }
    }
