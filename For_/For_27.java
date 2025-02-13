package For_;

public class For_27 {
        public static void main(String[] args) {
            int[] numeros = {10, 20, 30, 40, 50};

            int soma = calcularSoma(numeros);

            System.out.println("A soma dos números do vetor é: " + soma);
        }

        public static int calcularSoma(int[] arr) {
            int soma = 0;

            for (int numero : arr) {
                soma += numero;
            }

            return soma;
        }
    }

