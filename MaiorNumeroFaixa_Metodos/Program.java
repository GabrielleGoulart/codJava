package MaiorNumeroFaixa_Metodos;
import java.util.Scanner;


public class Program {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numero = pedirNumero(sc);

            Object categoria = new Object();
            categoria.verificarFaixa(numero);

            String result = categoria.showResult(numero);


            sc.close();
        }

        // Método para pedir um número ao usuário
        public static int pedirNumero(Scanner sc) {
            System.out.print("Digite um número: ");
            return sc.nextInt();


        }
    }

