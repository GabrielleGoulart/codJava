package Votacao_Metodos;

public class Object {
    public class VerificadorIdade {

        public int calcularIdade(int anoNascimento) {
            int anoAtual = 2025;
            return anoAtual - anoNascimento;
        }

        public static String verificarSituacaoVoto(int idade) {
            if (idade >= 16) {
                if (idade < 18) {
                    return "Você pode votar. O voto não é obrigatório, mas pode votar.";
                } else if (idade <= 70) {
                    return "Você pode votar. O voto é obrigatório.";
                } else {
                    return "Você pode votar. O voto é opcional para você.";
                }
            } else {
                return "Você não pode votar.";
            }
        }


        // Método que recebe um valor inteiro e retorna uma string formatada
        public static String showResult(int value) {
            return "Resultado: " + value;
        }
    }
}

