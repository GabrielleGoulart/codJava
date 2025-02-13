package Votacao_Metodos;
import java.util.Scanner;

public class Votacao_Metodos {
        public static void main(String[] args) {
            int anoNascimento = lerAnoNascimento();
            int idade = calcularIdade(anoNascimento);
            verificarSituacaoVoto(idade);
        }

        public static int lerAnoNascimento() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o seu ano de nascimento: ");
            int anoNascimento = sc.nextInt();
            return anoNascimento;
        }

        public static int calcularIdade(int anoNascimento) {
            int anoAtual = 2025;
            return anoAtual - anoNascimento;
        }

        public static void verificarSituacaoVoto(int idade) {
            if (idade >= 16) {
                System.out.println("Você pode votar.");
                if (idade < 18) {
                    System.out.println("O voto não é obrigatório, mas pode votar.");
                } else if (idade <= 70) {
                    System.out.println("O voto é obrigatório.");
                } else {
                    System.out.println("Você ainda não pode votar.");
                }
            }
        }
    }


