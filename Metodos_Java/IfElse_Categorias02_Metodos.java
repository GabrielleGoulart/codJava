package Metodos_Java;
import java.util.Scanner;


// codigo que verifica o numero pedido e indica a faixa que ele pertence
public class IfElse_Categorias02_Metodos {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero = pedirNumero(sc);
            verificarFaixa(numero);

            sc.close();
        }

        public static int pedirNumero(Scanner sc) {
            System.out.print("Digite um número: ");
            return sc.nextInt();
        }

        public static void verificarFaixa(int numero) {
            if (numero >= 1 && numero <= 10) {
                System.out.println("Faixa A");
            } else if (numero >= 11 && numero <= 20) {
                System.out.println("Faixa B");
            } else if (numero >= 21 && numero <= 30) {
                System.out.println("Faixa C");
            } else {
                System.out.println("Número fora das faixas de classificação.");
            }
        }
    }


