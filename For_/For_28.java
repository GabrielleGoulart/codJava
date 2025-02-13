package For_;

public class For_28 {
        public static void main(String[] args) {
            int[] numeros = {10, 20, 30, 40, 50};

            double media = calcularMedia(numeros);

            System.out.println("A média dos números do vetor é: " + media);
        }


        public static double calcularMedia(int[] arr) {
            int soma = 0;

            for (int numero : arr) {
                soma += numero;
            }

            return (double) soma / arr.length;
        }
    }

