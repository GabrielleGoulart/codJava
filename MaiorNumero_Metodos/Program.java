package MaiorNumero_Metodos;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                System.out.println("Coloque três números: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                int higher = Object.max(a, b, c);

                Object.showResult(higher);

        System.out.println(higher);  // Imprime o resultado no console

                sc.close();
            }
        }

