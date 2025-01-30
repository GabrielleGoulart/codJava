package org.JavaN.br;
import java.util.Scanner;
public class IfElse_Categorias05 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("digite a temperatura em graus Celsius: ");
            double Celsius= sc.nextDouble();

            if (Celsius <= 18) {
                System.out.println ("está uma temperatura considerada fria " + Celsius);
            } else if (Celsius > 19 && Celsius <= 26) {
                System.out.println ("está uma temperatura considerada agradavel " + Celsius);
            }else {
                System.out.println ("está uma temperatura considerada quente " + Celsius);
            }
            sc.close();
        }
}
