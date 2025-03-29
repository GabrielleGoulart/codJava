import java.util.InputMismatchException;
import java.util.Scanner;

public class MediaNotas_TryCatch {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       double[] notas = new double[3];

         for (int i = 0; i < 3; i++) {
         while (true) {

         try {
           System.out.print("Digite a nota " + (i + 1) + ": ");
             notas[i] = scanner.nextDouble();
             break;
          } catch (InputMismatchException e) {
           System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
            scanner.next();
                        }
                    }
                }

                double media = calcularMedia(notas);
                System.out.println("A média das notas é: " + media);
                scanner.close();
            }

            public static double calcularMedia(double[] notas) {
                double soma = 0;
                for (double nota : notas) {
                    soma += nota;
                }
                return soma / notas.length;
            }
        }
