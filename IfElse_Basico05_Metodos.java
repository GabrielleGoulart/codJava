package Metodos_Java;
import java.util.Scanner;


// código que analisa qual dos números selecionados é maior

public class IfElse_Basico05_Metodos {
      public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

          System.out.print("Digite o primeiro número: ");
          double num1 = sc.nextDouble();

          System.out.print("Digite o segundo número: ");
          double num2 = sc.nextDouble();

          System.out.print("Digite o terceiro número: ");
          double num3 = sc.nextDouble();

          double maiorNumero = encontrarMaior(num1, num2, num3);

          Resultado(maiorNumero);

                sc.close();
            }

    public static double encontrarMaior(double numero1, double numero2, double numero3) {
        if (numero1 >= numero2 && numero1 >= numero3) {
            return numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            return numero2;
        } else {
            return numero3;
        }
    }

    public static void Resultado(double maiorNumero) {
        System.out.println("O maior número é: " + maiorNumero);
    }
}
