package While;
import java.util.Scanner;

public class DoWhile_42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira numeros ou letras:  ");
        String str = sc.nextLine();

        int i = str.length() - 1;  // Começa pelo último índice da string

        do {
            System.out.print(str.charAt(i));  // Imprime o caractere na posição 'i'
            i--;  // Decrementa 'i' para acessar o próximo caractere
        } while (i >= 0);  // A condição verifica se 'i' é maior ou igual a 0

                sc.close();
            }
        }


