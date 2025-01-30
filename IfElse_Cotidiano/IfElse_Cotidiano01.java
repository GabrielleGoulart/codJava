package IfElse_Cotidiano;
import java.util.Scanner;

public class IfElse_Cotidiano01 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o número final da placa do veículo: ");
            int ultimoNumero = scanner.nextInt();

            if (ultimoNumero % 2 == 0) {
                System.out.println("O veículo com placa terminada em " + ultimoNumero + " pode passar pelo pedágio (par).");
            } else {
                System.out.println("O veículo com placa terminada em " + ultimoNumero + " não pode passar pelo pedágio (ímpar).");
            }

            scanner.close();
        }
    }


