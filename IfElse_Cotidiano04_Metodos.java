package Metodos_Java;
import java.util.Scanner;


// codigo que verifica idade e peso para doação de sangue
public class IfElse_Cotidiano04_Metodos {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int idade = pedirIdade(sc);
            double peso = pedirPeso(sc);

            verificarDoacao(idade, peso);

            sc.close();
        }

        public static int pedirIdade(Scanner sc) {
            System.out.print("Digite sua idade: ");
            return sc.nextInt();
        }

        public static double pedirPeso(Scanner sc) {
            System.out.print("Digite seu peso: ");
            return sc.nextDouble();
        }

        public static void verificarDoacao(int idade, double peso) {
            if (idade >= 18 && idade <= 65 && peso >= 50) {
                System.out.println("Você pode doar sangue");
            } else {
                System.out.println("Você não pode doar sangue");
            }
        }
    }

