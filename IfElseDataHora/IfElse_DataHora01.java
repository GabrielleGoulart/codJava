package org.JavaN.br;
import java.util.Scanner;

public class IfElse_DataHora01 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Informe um horario: ");
            double horario = sc.nextDouble();

            if (horario <= 24) {
                System.out.println ("horario valido!");
            }else {
                System.out.println (" o horario informado não é valido");

                sc.close();
            }
        }
    }
