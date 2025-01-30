package IfElse_DesafiosJogos;
import java.util.Random;
import java.util.Scanner;

public class IfElse_DesafiosJogos03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int numeroGerado = random.nextInt(20) + 1;
        int tentativas = 3; // Número de tentativas

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Tente adivinhar o número secreto"); //chance 10/100 de acertar!

        while (tentativas > 0) {
            System.out.print("Tentativa " + (4 - tentativas) + ": Digite um número: "); // calcula o número da tentativa atual com expressão de menos
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario == numeroGerado) {
                System.out.println("Parabéns! Você acertou o número em " + (4 - tentativas) + " tentativas."); // calcula o número de tentativas que o jogador utilizou para acertar o número secreto
                break; // Sai do loop se acertar
            } else if (numeroUsuario < numeroGerado) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");
            }

            tentativas--; // tentativas para acertar o número correto
        }
        if (tentativas == 0) {

            System.out.println("Fim de jogo! Você não adivinhou o número, o número era " + numeroGerado + ".");
        }

        scanner.close();
    }
}


