package Votacao_Metodos;

public class Object {
    public static String verificarSituacaoVoto(int idade) {
        if (idade >= 16) {
            System.out.println("Você pode votar.");
            if (idade < 18) {
                System.out.println("O voto não é obrigatório, mas pode votar.");
            } else if (idade <= 70) {
                System.out.println("O voto é obrigatório.");
            } else {
                System.out.println("Você ainda não pode votar.");
            }
        } else {
            System.out.println("Você não pode votar.");
        }


        public static int calcularIdade(int anoNascimento) {
            int anoAtual = 2025;
            return anoAtual - anoNascimento;
        }

        // Método que recebe um valor inteiro e retorna uma string formatada
        public static String showResult;(int value) {
            return "resultado: " + value;
        }
    }
        }






