package org.JavaN.br;
import java.util.Scanner;

public class IfElse_DataHora02 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("digite o numero do mês (1 - 12): ");
            double mes = sc.nextDouble();

            if (mes > 1 && mes < 12) {
                System.out.println ("mês valido!");
            }else {
                System.out.println (" o mês informado não é valido");

                sc.close();
            }
        }
    }


