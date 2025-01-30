package IfElse_DesafiosJogos;
import java.util.Scanner;

public class IfElse_DesafiosJogos02 {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Digite o primeiro numero: ");
            int num1 = sc.nextInt();

            System.out.print("Digite o segundo numero: ");
            int num2 = sc.nextInt();

            if (num1 > 2 * num2) {
                System.out.println("o numero " +  num1 +" é maior que o dobro de " + num2);
            }else {
                System.out.println("o numero " + num1 +" NÃO é maior que o dobro de " + num2);
            }
            sc.close();
        }

    }

