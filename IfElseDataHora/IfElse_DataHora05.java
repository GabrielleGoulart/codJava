package org.JavaN.br;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class IfElse_DataHora05 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) { // Loop para continuar até data seja válida
                System.out.print("Digite a data no formato dd/MM/yyyy: ");
                String data = sc.nextLine();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                try {
                    LocalDate localDate = LocalDate.parse(data, formatter);
                    System.out.println(data + " é uma data válida.");
                    break; // Sai do loop se a data for válida
                } catch (DateTimeParseException e) {
                    System.out.println("Erro: Data inválida. Verifique o formato e os dias do mês.");
                }
            }

            sc.close();
        }
    }

