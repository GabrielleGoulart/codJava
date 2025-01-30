package org.JavaN.br;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class IfElse_DataHora04 {

    public static final String Manha = "de manhã";
    public static final String Tarde = "à tarde";
    public static final String Noite = "à noite";
    public static final String Madrugada = "de madrugada";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um horário (HH:mm): ");
            String horarioStr = sc.nextLine();

            try {
                LocalTime horario = LocalTime.parse(horarioStr, DateTimeFormatter.ofPattern("HH:mm"));

                String periodo = determinarPeriodo(horario);

                System.out.println("O horário " + horarioStr + " é " + periodo + ".");
                break; // Sai do loop se o horário for válido
            } catch (DateTimeParseException e) {
                System.out.println("Erro: Horário inválido. Use o formato HH:mm (00:00 - 23:59).");
            }
        }
        sc.close();
    }

    public static String determinarPeriodo(LocalTime horario) {
        LocalTime manhaInicio = LocalTime.of(5, 0); // Manhã: 05:00 - 12:00
        LocalTime tardeInicio = LocalTime.of(12, 0); // Tarde: 12:00 - 18:00
        LocalTime noiteInicio = LocalTime.of(18, 0); // Noite: 18:00 - 05:00

        if (horario.isAfter(manhaInicio) && horario.isBefore(tardeInicio)) {
            return Manha;  // Manhã
        } else if (horario.isAfter(tardeInicio) && horario.isBefore(noiteInicio)) {
            return Tarde;
        } else if ((horario.isAfter(noiteInicio) && horario.isBefore(LocalTime.of(23, 59))) || horario.isBefore(manhaInicio)) {
            return Noite;
        } else {
            return Madrugada;
        }
    }

}


