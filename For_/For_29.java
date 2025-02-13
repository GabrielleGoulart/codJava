package For_;

public class For_29 {
        public static void main(String[] args) {

            int[] numeros = {64, 25, 12, 22, 11};

            selectionSort(numeros);

            System.out.println("Vetor ordenado em ordem crescente:");
            for (int num : numeros) {
                System.out.print(num + " ");
            }
        }

        public static void selectionSort(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n - 1; i++) {
                int indiceMinimo = i;
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] < arr[indiceMinimo]) {
                        indiceMinimo = j;
                    }
                }

                int temp = arr[indiceMinimo];
                arr[indiceMinimo] = arr[i];
                arr[i] = temp;
            }
        }
    }
