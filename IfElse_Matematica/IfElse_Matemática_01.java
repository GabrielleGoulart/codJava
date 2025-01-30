package If_else;

import java.util.Scanner;

public class IfElse_Matemática_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = sc.nextDouble();


        if (numero1 + numero2 > 100) {
            System.out.println("A soma é maior que 100 ");

        } else {
            System.out.println("A soma é menor que 100: ");


            sc.close();
        }
    }
}
